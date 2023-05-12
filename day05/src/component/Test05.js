import React, { useEffect } from 'react';
import { useState } from 'react';

const user = [
    {id: 1, name:'홍길동'},
    {id: 2, name:'이순신'},
    {id: 3, name:'유관순'},
    {id: 4, name:'안중근'},
    {id: 5, name:'이봉창'},
    {id: 6, name:'신사임당'},
    {id: 7, name:'윤봉길'},
    {id: 8, name:'이승만'},
    {id: 9, name:'박정희'},
    {id: 10, name:'노태우'}
  ];
  

const Test05 = () => {
    const[text,setText] = useState('')
    const[refresh,setRefresh] = useState('1')
    
    
    const[data,setData] = useState(user)
    
    
    // 글자가 입력될 떄 마다 바로바로 결과가 뜬다
    useEffect(()=>{
        setData(user.filter(item => item.name.toLowerCase().indexOf(text.toLowerCase()) !== -1))
    }, [refresh])
   
    // 검색버튼 useMemo
    const onSearch = ()=>{
        setRefresh(refresh+1)
    }


    return (
        <div>
            <input type="text" value={text} onChange={(e)=>{setText(e.target.value)}}></input>
            <button onClick={onSearch}>검색</button>
            <ul>
                {data.map((item) => (
                    <li key={item.id}> {item.id} : {item.name}</li>
                ))}
            </ul>   
        </div>
    );
};
    
export default Test05;