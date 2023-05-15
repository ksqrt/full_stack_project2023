import React from 'react';
import { Link, useNavigate } from 'react-router-dom';

const Member = ({item}) => {
    const navigate = useNavigate()
    const onGo = ()=>{
        navigate(`/member/${id}`)
    }

    const {id,name,email} = item
    const css ={
        border : '1px solid cyan',
        margin : 20,
        padding : 20


    }

    return (
        <div style ={css}>
            {id}/{name}/{email}
            <p><Link to={`/member/${id}`}>...더보기</Link></p>
            <button onClick={ onGo }>상세보기</button>
        </div>
    );
};

export default Member;