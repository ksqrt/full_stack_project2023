import React, { useEffect, useState } from 'react';

const Test02Sub = () => {
    const[x,setX] =useState(0)
    const [y,setY] = useState(0)

    useEffect(()=>{
        console.log('useEffect')
        window.addEventListener('mousemove',onMove)
        return ()=>{
            console.log('cleanup')
            window.removeEventListener('mousemove',onMove)
        }
    },[])

    const onMove = (e) =>{
        setX(e.clientX)
        setY(e.clientY)

    }

    return (
        <div>
            <h2>마우스 좌표</h2>
            <div style={{border : '1px solid #000', width:400,padding:30,margin:15}}>
                <h3>X:축 :{x}, y축 : {y}</h3>
            </div>
        </div>
    );
};

export default Test02Sub;