import React,{useState} from 'react';

const Test02 = () => {
    const [chk, setChk] = useState(true)
    const onChk = (e) => {
        const {checked} = e.target
        setChk(checked)
    }

    return (
        <div style={{fontSize:25, margin:30, color:chk ? 'blue' : 'red'}}>
            <input type='checkbox' checked={ chk } onChange={ onChk }/>Have a nice day!!
        </div>
    );
};

export default Test02;