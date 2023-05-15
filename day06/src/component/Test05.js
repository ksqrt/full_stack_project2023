import React, { useEffect, useReducer,useState} from 'react';
import axios from 'axios';

// 예시 json
// {
//     albumId: 2,
//     id: 52,
//     title: "eveniet pariatur quia nobis reiciendis laboriosam ea",
//     url: "https://via.placeholder.com/600/121fa4",
//     thumbnailUrl: "https://via.placeholder.com/150/121fa4"
//     } 



const Test05 = () => {

    const [id,setId] = useState(1)
    const [search,getSearch] = useState("1")

    const onSearch=()=>{
        getSearch(search+1)
    }

    const initialState = {
        data : {},
        error : null,
        loading : true 
    }

    useEffect(()=>{
        const url = `https://jsonplaceholder.typicode.com/photos/${id}`
        axios.get(url)
        // 성공시
        .then(res => {
            dispatch({type : 'SUCCESS', payload:res.data})
        })
        .catch(error =>{
            dispatch({type : 'ERROR'})
        })
    },[search])

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
            ID 입력 (1~5000) : <input type="text" value={id} onChange={(e)=>{setId(e.target.value)}}></input>
            <button onClick={onSearch}>검색</button>

            <h2>
                {state.data && state.loading ? '로딩중' : <img src={state.data.thumbnailUrl} />}
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

export default Test05;