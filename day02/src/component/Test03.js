import React,{useState} from 'react';


const Test03 = () => {
    const [color,setColor] = useState('cyan');
    const [age,setAge] = useState(25);
    const [name ,setName] = useState('홍길동');
    
    const onName = () => {
        setName('코난')
    }
    const onAge = (num) => {
        setAge(num)
    }
    const onColor = (color) => {
        setColor(color)
    }

    return (
        <div>
        <h2 style = {{background : color}}>
            
            이름 : {name} / 나이 :{age}
            
        </h2>
        <p>
            <button onClick={() => {onName()}}> 코난으로 이름 변경</button>
            <button onClick={() => {onAge(30)}}> 나이를 30살로 변경</button>
            <button onClick={() => {onColor('blue')}}> 파란색</button>
        </p>
        </div>
    );
};

export default Test03;