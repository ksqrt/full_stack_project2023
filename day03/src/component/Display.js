import React from 'react';

const Display = (props) => {
    return (
        <div>
            <h2> Display 컴포넌트</h2>
            <label>  내가 좋아하는 동물은 ? {props.name}  </label>
        </div>
    );
};

export default Display;