import React from 'react';
import {BrowserRouter, Link, Route, Routes} from 'react-router-dom'
import Home from './component/page01/Home';
import About from './component/page01/About';
import Ceo from './component/page01/Ceo';
import Sub01 from './component/page01/Sub01';
import NotFiles from './component/page01/NotFiles';

const App01 = () => {
    return (
        <BrowserRouter>
            <>
                <nav>
                    <ul>
                    {/* a 태그 대신 Link 사용합니다 */}
                    <li><Link to = '/' >Home</Link></li>
                    <li><Link to = '/about' >about</Link></li>
                    <li><Link to = '/ceo' >ceo</Link></li>
                    <li><Link to = '/sub01' >sub01</Link></li>
                    </ul>
                </nav>
            </>

            {/* 화면에 보이는 영역입니다. */}
            <Routes>
                <Route path = '/' element={<Home></Home>}></Route>
                <Route path = '/about' element={<About></About>}></Route>

                <Route path = '/ceo' element={<Ceo></Ceo>}></Route>
                <Route path = '/sub01' element={<Sub01></Sub01>}></Route>
                <Route path = "*" element={<NotFiles></NotFiles>}></Route>
            </Routes>
        </BrowserRouter>
    );
};

export default App01;