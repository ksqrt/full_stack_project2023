import React from 'react';
import Test08Big from './Test08Big';
import Test08List from './Test08List';
import '../css/Test08.css'
const Test08View = ({data,one,onView}) => {
    return (
        <div className='bigview'>
            <Test08Big  one ={one} ></Test08Big>
            <Test08List data ={data} onView={onView}></Test08List>
        </div>
    );
};

export default Test08View;