import React, { useEffect, useState } from 'react';

const Test01 = () => {
    
    
    const names = '안효섭, 이제훈, 김세정,김래원,김태리,여진구,공유,이준기,아이유'.split(',')
    const [name,setName] = useState('홍길동')
    const[age,setAge] = useState(25)
    
    // 이건 값이 변하기만 하면 실행이된다.  
    // [] 안의 값을 공백을 두면 시작하면서 딱1번만 실행 이후 [] 안에 있는 state가 변경될떄만 실행
    // useEffect(()=>{
    //     console.log('안녕하세요')
    // },[])
    useEffect(()=>{
        console.log('안녕하세요')
    },[name])
    
    const onName = () => {
        const index = Math.floor(Math.random() * names.length)
        setName(names[index])
    }
    const onAge=()=>{
        setAge(age+1)
    }

    return (
        <div>
            <button onClick={onName}>이름변경</button>            
            <button onClick={onAge}>나이증가</button>            
            <hr></hr>
            <h1>{name}</h1>
            <h1>{age}</h1>
        </div>
    );
};

export default Test01;