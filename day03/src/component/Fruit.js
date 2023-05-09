import React from 'react';

const Fruit = (props) => {
    return (
        <div>
            <h2>Fruit 컴포넌트</h2>
          
            <label> 과일의 이름입력</label>
             <input type ="text" value={props.fruit} onChange={props.onInputFruit}></input>
            
        </div>
    );
};

export default Fruit;