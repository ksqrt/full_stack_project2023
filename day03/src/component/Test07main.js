import React, { useState } from 'react';
import Test07input from './Test07input';
import Test07print from './Test07Print';
import Test07Output from './Test07Output';
import '../css/Test07.css'

const Test07main = () => {
    
    const [count,setCount] = useState(1)
    const onNext = () =>{
        setCount(count+1)
    }
    const onPrev = () =>{
        setCount(count-1)
    }

    const [data,setData] = useState({
        name : '',
        age:'',
        addr:'',
        phone:''
    })


    const {name,age,addr,phone} = data;
    
    const onInput = (e) =>{
        // 비구조할당
        const {value,name} = e.target
        // 기존 객체는 복사하고 원하는것만 수정해서 한번에 set 합니다.
        setData({
            ...data,
            [name]:value
        })
    }
    return (
        <div>
            {
                count === 1 && <Test07input name = {name} age ={age} addr={addr} phone = {phone} onInput={onInput} onNext={onNext}></Test07input>
            }
            {
                count === 2 && <Test07print name = {name} age ={age} addr={addr} phone = {phone}  onNext={onNext} onPrev={onPrev}></Test07print> 
            }
            {
                count === 3 && <Test07Output name = {name} age ={age} addr={addr} phone = {phone}></Test07Output>
            }
        </div>
    );
};

export default Test07main;