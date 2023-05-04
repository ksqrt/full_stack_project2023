import React from 'react';

const Test02 = () => {
    const title ="신상명세서"
    const arr = ['홍길동','둘리','코난','라이언','네오']
    const data = [
        {id:1,name:'홍길동'},
        {id:2,name:'코난'},
        {id:3,name:'둘리'},
        {id:4,name:'라이언'},
        {id:5,name:'네오'},
    ]    
    return (
        <div>
            <h2>{title}</h2>
            <ul style= {{border: '1px solid red'}}>
                {
                    arr.map((item,index)=>{
                        return(<li key = {index}>{index+1}: {item}</li>) 
                    })
               }
            </ul>
            <ul></ul>
        </div>
    );

};

export default Test02;