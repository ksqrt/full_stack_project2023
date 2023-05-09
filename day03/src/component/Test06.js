import React,{useState} from 'react';




const Test06 = () => {
    // const [name,setName] = useState("")
    // const [id,setId] = useState("")
    // const [pwd,setPwd] = useState("")
    const onreset = () =>{
        setData({
            name : '',
            id:'',
            pwd:''
        })
    }

    const [data,setData] = useState({
        name : '',
        id:'',
        pwd:''
    })
    const {name,id,pwd} = data;
    
    const onInput = (e) =>{
        // 비구조할당
        const {value,name} = e.target
        // 기존 객체는 복사하고 원하는것만 수정해서 한번에 set 합니다.
        setData({
            ...data,
            [name]:value
        })
    }
    return (
        <div>
            <table border = '1' cellPadding='5' cellSpacing='0'>
                <tr>
                    <th width='100'>이름</th>
                    <td>
                        <input type="text" name ='name' value={name} onChange={onInput}></input>
                    </td>
                </tr>
                <tr>
                    <th width='100'>아이디</th>
                    <td>
                        <input type="text" name ='id' value={id} onChange={onInput}></input>
                    </td>
                </tr>
                <tr>
                    <th width='100'>비밀번호</th>
                    <td>
                        <input type="password" name ='pwd' value = {pwd}  onChange={onInput}></input>
                    </td>
                </tr>
                <tr>
                    <td colSpan={2} align='center'>
                    <button onClick={ onreset }>초기화 </button>
                    </td>
                </tr>
            </table>
            <hr></hr>
            <h3>이름 : {name}</h3>
            <h3>아이디 : {id}</h3>
            <h3>비밀번호 : {pwd}</h3>

        </div> 
    );
};

export default Test06;