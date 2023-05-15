import React from 'react';
import { BrowserRouter, Link, Route, Routes } from 'react-router-dom';
import Main from './component/page05/Main';
import Product from './component/page05/Product';
import ProductDetail from './component/page05/ProductDetail';

const App05 = () => {
    return (
        <BrowserRouter>
            {/* 화면에 보이는 영역 */}
            <nav>
                <ul>
                    <li><Link to ='/'>Home</Link></li>
                    <li><Link to ='/product'>Productlist</Link></li>
                </ul>
            </nav>

            <Routes>
                <Route path='/' element={<Main></Main>}></Route>
                <Route path='/product'>
                    <Route index element={<Product></Product>}></Route>
                    <Route path=":productId" element ={<ProductDetail></ProductDetail>}></Route>
                </Route>
                
            </Routes>
        </BrowserRouter>
    );
};

export default App05;