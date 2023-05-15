import React ,{useState,useRef}from 'react';
import styles from '../css/TodoForm.module.css'

const TodoForm = ({onAdd}) => {
    
    const textRef = useRef();
    
    const [text,setText] = useState('')

    const onInput = (e)=>{
        const {value}  = e.target
        setText(value)
    }
    const onSubmit = (e)=>{
        e.preventDefault()
        if (text){
            onAdd(text)
            setText('')
            // 추가된뒤 포커스하기
            textRef.current.focus();
        }
        
        return 
    }

    
   


    return (
        
        <div>
            <form className={styles.TodoForm} onSubmit={onSubmit}>
                <input type="text" ref={textRef} placeholder="해야 할 일을 입력하시오" onChange={onInput} value={text}></input>
                <button type ="submit"> 추가   </button>
                <div>{text}</div>
            </form>
        </div>
    );
};

export default TodoForm;