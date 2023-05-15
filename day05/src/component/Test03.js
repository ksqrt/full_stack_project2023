import React, { useMemo, useState } from 'react';

const Test03 = () => {
    const [count1,setCount1] =useState(1)
    const [count2,setCount2] =useState(1)

    // 사용자가 함수를 만들ㅇ어서 return 할경우 return 값을 기억하기 떄문에 결과가 짝수 또는 홀수가 나온다
    // count1 의 값이 변할때만 useMemo 가 실행되고 count2 값이 변할떄는 호출 x
    
// useMemo 는 주로 effect 에 따라 값이 변하는 것에 사용합니다.
    const isEven = useMemo(()=>{
        return  count1%2 ===0
    },[count1])
    
    return ( 
        <div>
                       
            <h2>카운트 :  {count1}</h2>
            <button onClick={()=> setCount1(count1+1)}>증가</button>
            <h2>카운트 :  {count2}</h2>
            <button onClick={()=> setCount2(count2+1)}>증가</button>
            <h2>
                결과 : {isEven ? "짝수" : "홀수"}
            </h2>
        </div>
    );
};

export default Test03;