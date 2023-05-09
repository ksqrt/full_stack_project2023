import React from 'react';

const Test07Print = (props) => {
    return (
        <div>
            <ul>
                <li> 이름 : {props.name}</li>
                <li> 나이 : {props.age}</li>
                <li> 주소 : {props.addr}</li>
                <li> 핸드폰 : {props.phone}</li>

            </ul>
            <button onClick={props.onPrev}>이전</button> &nbsp;
            <button onClick={props.onNext}>다음</button>
        </div>
    );
};

export default Test07Print;