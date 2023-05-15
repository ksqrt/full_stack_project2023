import React, { useState } from 'react';
import Test08View from './Test08View'
import dataList from './Test08Data'


const Test08Gallery = () => {
    const [data,setData] = useState(dataList) ;
    const [one,setOne] =useState(data[0]);
    
    const onView = (id) =>{
        setOne(data[id-1])
        // setData(id-1)
    }

    return (
        <div className='wrap'>
            <Test08View data = {data} one ={one} onView={onView}></Test08View>
        </div>
    );
};

export default Test08Gallery;

