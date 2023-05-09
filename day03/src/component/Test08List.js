import React from 'react';
import Test08Item from './Test08Item';

const Test08List = () => {
    return (
        <ul className='list'>
            {/* map 으로 반복문 */}
            <Test08Item></Test08Item>
        </ul>
    );
};

export default Test08List;