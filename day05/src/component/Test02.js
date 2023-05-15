import axios from 'axios';
import React, { useEffect, useState } from 'react';

const Test02 = () => {
    const [id,setId] = useState('1')
    const [dto,setDto] = useState([])
    const [search,setSearch] = useState('1')

    const onSearch = (id) =>{
        setSearch(id)
    }

    useEffect(()=>{
        axios.get(`https://jsonplaceholder.typicode.com/posts/${id}`)
            .then(res => setDto(res.data))
    },[search]) 

    console.log(dto)
    return (
        <div>
            <input type="text" value={id} onChange={(e) => setId(e.target.value)}></input>
            <button onClick={()=>{onSearch(id)}}>검색</button>
            <hr></hr>
            <h3>{dto.id}/{dto.title}</h3>
        </div>
    );
};

export default Test02;