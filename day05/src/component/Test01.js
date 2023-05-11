import React, { useEffect, useState } from 'react';
import axios from 'axios';

const Test01 = () => {
    const [data,setData] = useState([

        // 1 번 
        useEffect(()=>{
            fetch('https://jsonplaceholder.typicode.com/posts')
            .then(res => res.json() )
            .then(res => setData(res))
        },[])
    ])
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