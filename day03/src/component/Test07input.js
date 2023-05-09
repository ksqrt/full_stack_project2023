import React from 'react';

const Test07input = (props) => {
    const {name,age,phone,addr} = props;

    return (
        <div>
            <table border = '1' cellPadding='5' cellSpacing='0'>
                <tr>
                    <th width='100'>이름</th>
                    <td>
                        <input type="text" name ='name' value={name} onChange={props.onInput}></input>
                    </td>
                </tr>
                <tr>
                    <th width='100'>나이</th>
                    <td>
                        <input type="text" name ='age' value={age} onChange={props.onInput}></input>
                    </td>
                </tr>
                <tr>
                    <th width='100'>주소</th>
                    <td>
                        <input type="text" name ='addr' value = {addr} onChange={props.onInput}></input>
                    </td>
                </tr>
                <tr>
                    <th width='100'>핸드폰</th>
                    <td>
                        <input type="text" name ='phone' value = {phone} onChange={props.onInput}></input>
                    </td>
                </tr>
                <tr>
                    <td colSpan={2} align='center'>
                    <button onClick={props.onNext}> 다음 </button>
                    
                    </td>
                </tr>
            </table>
        </div>
    );
};

export default Test07input;