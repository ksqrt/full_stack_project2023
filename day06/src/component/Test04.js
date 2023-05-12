import React, { useEffect, useReducer } from 'react';
import axios from 'axios';

const Test04 = () => {
    
    const initialState = {
        data : {},
        error : null,
        loading : true 
    }

    useEffect(()=>{
        const url = 'https://jsonplaceholder.typicode.com/posts/3'
        axios.get(url)
        // 성공시
        .then(res => {
            dispatch({type : 'SUCCESS', payload:res.data})
        })
        .catch(error =>{
            dispatch({type : 'ERROR'})
        })
    },[])

    const reducer = (state,action) =>{
        switch (action.type){
            case 'SUCCESS':
                return{
                    data : action.payload,
                    error : null,
                    loading : false
                }
            case 'ERROR' :
                return {
                    data : "",
                    error : "ERROR",
                    loading : true
                }
        }
    }

    const [state,dispatch] = useReducer(reducer,initialState)



    return (
        <div>
            <h2>
                {
                    state.data && state.loading ? '로딩중' : state.data.title
                }
            </h2>
            {/* 에러 */}
            <p>
                {
                    state.error ? state.error : null
                }
            </p>
        </div>
    );
};

export default Test04;