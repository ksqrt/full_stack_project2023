import React from 'react';

const test5Sub = (props) => {

    const {color} = props
    const {bgcolor} = props
    
    const css1 = { 
        color: color,
        backgroundColor : bgcolor,
    }
    

    return (
        <div style = {css1}>
            <h2 >신상명세서</h2>
                <ul>
                    <li>
                        이름 : {props.name}
                    </li>
                    <li>
                        나이 : {props.age}
                    </li>
                    <li>
                        핸드폰 : {props.tel}
                    </li>
                    <li>
                        주소 : {props.name}
                    </li>
                    
                    <li>
                        동의여부 : {props.name ? "동의" : "비동의"}
                    </li>

                </ul>
        </div>
    );
};

export default test5Sub;