import React from 'react';
import data from './data';
import { Link } from 'react-router-dom';

const Product = () => {
    return (
        <div className='products'>
            <h2>찌오의 일상리스트</h2>
            <div>
                {
                    data.map(item=> <article key={item.id}>
                        <Link to={`/product/${item.id}`}>
                        <h3>{item.name}</h3>
                        <p><img src ={item.photo} alt={item.name}></img></p>
                        </Link>                        
                    </article>)
                }
            </div>
        </div>
    );
};

export default Product;