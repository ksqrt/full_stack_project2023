import React from 'react';
import Test5Sub from './test5Sub'
const test5 = () => {
    return (
        <div>
            <Test5Sub name="홍길동"
                    age = {19}
                    addr = "서울"
                    tel = '010-4392-9924'
                    color = "tomato"
                    bgcolor = "pink"
                    done= {true}
            >
            </Test5Sub>
            <hr></hr>
            
            <Test5Sub 
            name ="코난"
            addr = "부산"
            color = "skyblue"
            bgcolor = "hotpink"
            ></Test5Sub>
        </div>
    );
};

export default test5;