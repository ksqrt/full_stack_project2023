import React from 'react';
import { useParams } from 'react-router-dom';

const Front = ({data}) => {
    // :name 의 값을 받아온다. 파람을 가지고옴
    const {name} = useParams()
    return (
        <div>
            <h1>Front Page</h1>
            <h1>useParams : { name }</h1>
            <hr></hr>
            {
                data.filter(item => item.title === name)
                .map((item,index) => 
                    <div key={index}>
                        <h2>{item.title} / {item.info}</h2>
                    </div>
                    )

                
            }
        </div>
    );
};

export default Front;