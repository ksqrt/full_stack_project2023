import React from 'react';
import styles from '../css/TodosList.module.css'
import TodoItem from './TodoItem';

const TodoList = ({data,onDel}) => {
    
    return (
        <ul className={styles.TodoList}>
        
        {
        data.map((item, index) => 
            (
                // 키값을 seq 를 만들어서 주기
                <TodoItem key={item.seq} item={item} onDel={onDel}></TodoItem>
            )
        )
        }
        </ul>
    );
};

export default TodoList;