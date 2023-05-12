import React, { useReducer } from 'react';

const reducer = (state,action) => {
    switch(action.type){
        case 'INCREMENT' : return state+1
        case 'DECREMENT' : return state-1
        case 'RESET': return 0
        default : 
        return false
    }

}

const Test01 = () => {
    // const -> state 전달 되고 dispatch -> action 으로 전달됩니다.
    // reducer 는 state, action 을 받아서 새로운 state 함수를 반환합니다.
    const initalState = 0
    const [count, dispatch] = useReducer(reducer,initalState)
    
    return (
        <div>
            <h1>카운트 : {count}</h1>
            <p>
                <button onClick={()=>{dispatch({type:'INCREMENT'})}}>증가</button>
                <button onClick={()=>{dispatch({type:'DECREMENT'})}}>감소</button>
                <button onClick={()=>{dispatch({type:'RESET'})}}>초기화</button>

            </p>
        </div>
    );
};

export default Test01;