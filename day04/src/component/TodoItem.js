import React from 'react';

const TodoItem = ({item,onDel}) => {
    const {seq,text} = item
    return (
        <li>
            {item.seq} 번 : 
            {item.text}
            <button onClick={()=>{onDel(item.seq)}}>삭제</button>
        </li>
        );
};

export default TodoItem;