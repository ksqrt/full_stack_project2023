import React from 'react';

const Name = (props) => {
    return (
        <div>
            <h2>Name 컴포넌트</h2>
            
            <label> 이름입력</label>
             <input type ="text" value={props.name} onChange={props.onInputName}></input>
            
        </div>
    );
};

export default Name;