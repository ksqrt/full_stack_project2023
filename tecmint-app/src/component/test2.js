import React from 'react';

const test2 = () => {
    const title ="신상명세서"
    const name = "홍길동"
    const age = 25
    const addr = "서울"

    const css1 = { 
        color:'red',
        backgroundColor : 'yellow',
        fontSizer : 10,
        padding: 20,
        margin: 10,
        border :'3px solid #000'
    }
    const css2 = {
        width: 40,
        
       
      backgroundColor: 'hotpink',
        
       
      fontSize: 20,
        
       
      padding: 5
      }
   
    return (
        <>
            <h2>JSX 영역</h2>
            <h2 style = {css1}>{title}</h2>
            <ul>
                <li style = {css2}>이름 :{name}</li>
                <li>나이 {age}살 {age >=19 ? '성인':'청소년'} </li>
                <li>주소 :{addr}</li>
                
            </ul>
        </>
    );
};

export default test2;