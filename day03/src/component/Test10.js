import React, { useRef, useState } from 'react';

const Test10 = () => {
    const seq = useRef(1)
   const nameRef = useRef()
   const [data,setData] = useState([])
   const [form,setForm] = useState({
    name : "",
    age : ""
   })

   const onInput = (e) => {
    const {name,value} = e.target
    // 이건 복사
    setForm({
        ...form,
        [name]:value
    })
   }

   const onAdd = (e) =>{
        e.preventDefault(); // 브라우저 고유의 동작을 중단시켜준다
        if(!name || !age){
            return
        } 
        // 이건 추가임
        setData([
            ...data,
            {
                seq : seq.current++,
                name, /// name : name => key: value 가 똑같으면 1번만 써도댐
                age:age //age : age
            }
        ])
        //초기화
        setForm({
            name:'',
            age:''
        })
        nameRef.current.focus()

   }


   const {name,age} = form;
 
    return (
        <div>
            <form onSubmit={onAdd}>
                이름 : <input type="text" name = "name" value={name} onChange={onInput} ref ={nameRef}></input>
                <br></br>
                나이 : <input type="text" name = "age"  value={age} onChange={onInput}></input>
                <br></br>
                <button type ="submit"> 추가</button>
            </form>
            <ul>
            {
                data.map(item =>
                <li>
                    {item.seq} / {item.name} : {item.age}
                </li>)
            }
            </ul>
        </div>
    );
};

export default Test10;