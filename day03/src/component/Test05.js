import React, { useState } from 'react';
import Name from './Name';
import Fruit from './Fruit';
import Output from './Output';



const Test05 = () => {
    const [name,setName] = useState("")
    const [fruit,setFruit] = useState("")

    const onInputName = (e) =>{
        const {value}  = e.target
        setName(value)
    }
    const onInputFruit = (e) =>{
        const {value}  = e.target
        setFruit(value)
    }

    return (
        <div>
            <Name  name = {name} onInputName ={onInputName}></Name>
            <hr ></hr>
            <Fruit  fruit= {fruit} onInputFruit ={onInputFruit}></Fruit>
            <hr></hr>
            <Output name = {name} fruit= {fruit}  ></Output>
        </div>
    );
};


export default Test05;