import React, { useState } from 'react';
import Test02Sub from './Test02Sub';

const Test02 = () => {
    const [isShow,setIsShow] = useState(false)
    
    const onToggle =()=>{
        setIsShow(!isShow)
    }


    return (
        <div>
            <button onClick={onToggle}>{isShow ? "숨기기":"보이기"}</button>
            <hr></hr>
            {
                isShow && <Test02Sub></Test02Sub> 
            
            }
        </div>
        
    );
};

export default Test02;