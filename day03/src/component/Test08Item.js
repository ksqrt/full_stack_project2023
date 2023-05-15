import React from 'react';

const Test08Item = ({item,onView}) => {
    return (
        // <li>
        <li onClick={ ()=> onView(item.id)} >
            <img src={item.img} ></img>
        </li>            
    );
};

export default Test08Item;