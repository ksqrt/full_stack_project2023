import React, { useEffect, useState } from 'react';
import axios from 'axios';

const Test01 = () => {
    const [data,setData] = useState([])
    // 1 번 
    // useEffect(()=>{
    //     fetch('https://jsonplaceholder.typicode.com/posts')
    //     .then(res => res.json() )
    //     .then(res => setData(res))
    // },[])
    
    // 2 번
    // useEffect(()=>{
    //     axios.get('https://jsonplaceholder.typicode.com/posts')
    //     .then(res => setData(res.data))
    // },[])

    // 3번
    // useEffect(()=>{
    //     const getData = async()=>{
    //         const res = await fetch('https://jsonplaceholder.typicode.com/posts')
    //         const data = await res.json()
    //         setData(data)
    //     }
    //     getData()
    // },[])

    // 4번 
    useEffect(()=>{
        const getData = async()=>{
            const res = await axios.get('https://jsonplaceholder.typicode.com/posts')
            setData(res.data)
        }
        getData()
    },[])

    console.log(data)

    return (
        <div>
           {
            data.map(item => 
                <li key = {item.id}>
                {item.id} / {item.title}
                </li>
                )
           }
        </div>
    );
};

export default Test01;