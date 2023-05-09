import React from 'react';

const Output = (props) => {
    return (
        <div>
            <h2>Output 컴포넌트</h2>
            <p>  이름은 {props.name}</p> 
            <p>  과일은 {props.fruit}</p> 
        </div>
    );
};

export default Output;