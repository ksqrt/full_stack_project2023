import React from 'react';

//비구조 할당


const Lion = (props) => {
    const {name} = props
    
    return (
        <div>
            나는 {name} 컴포넌트
        </div>
    );
};

export default Lion;