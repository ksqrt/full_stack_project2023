import React from 'react';
import {BrowserRouter, Link, Route, Routes} from 'react-router-dom'
import Home from './component/page02/Home';
import About from './component/page02/About';
import Ceo from './component/page02/Ceo';
import Sub01 from './component/page02/Sub01';
import NavBar from './component/page02/NavBar';
import NotFiles from './component/page02/NotFiles';



const App02 = () => {
    return (
        <BrowserRouter>

            <NavBar>    </NavBar>
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

export default App02;