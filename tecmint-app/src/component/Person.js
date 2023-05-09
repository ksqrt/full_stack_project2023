import React from 'react';

const Person = (props) => {
    
    const {name,age} = props
    return (
        <div>
           <h1> 나의이름은 {name} 나이는 {age} 살 입니다.</h1>
        </div>
    );
};

export default Person;