import React from 'react';
import Test08Item from './Test08Item';

const Test08List = ({data,onView}) => {
    return (
        <ul className='list'>
            {/* map 으로 반복문 */}
            {
                data.map(item => <Test08Item key={item.id} item = {item} onView={onView}></Test08Item>)
            }
            
        </ul>
    );
};

export default Test08List;