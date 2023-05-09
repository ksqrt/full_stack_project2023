import React, {useState} from 'react';
import '../css/Test03.css'
import Test03Modal from './Test03Modal';

const Test03 = () => {
    const [isOpen, setIsOpen] = useState(false) //초기값 false
    const onOpen = () => {
        setIsOpen(true)
    }
    const onClose = () => {
        setIsOpen(false)
    }
    return (
        <div>
            <button className='button' onClick={ onOpen }>팝업창</button>
            {
                isOpen && <Test03Modal onClose={ onClose }/>
            }
        </div>
    );
};

export default Test03;