import React from 'react';
import { useNavigate, useParams } from 'react-router-dom';
import data from './data';

const ProductDetail = () => {
    const navigate = useNavigate()
    const onHome = ()=>{
        navigate(`/`)
    }
    const onList = ()=>{
        navigate(`/product`)
    }
    const {productId} = useParams()
    const item = data.find(item => item.id == productId)
    return (
        <div className='item'>
           <h2>찌오의 상세 페이지</h2>
           <h3> 제품명 : {item.name } /가격 {item.price}</h3>
           <p><img src = {item.photo} alt={item.name}></img></p>
           <p> 제품설명 : {item.description}</p>

           <button onClick={onHome}>onHome</button>
           <button onClick={onList}>onList</button>
        </div>
    );
};

export default ProductDetail;