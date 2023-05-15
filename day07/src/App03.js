import React from 'react';
import {BrowserRouter, Link, Route, Routes} from 'react-router-dom'
import Home from './component/page03/Home';
import About from './component/page03/About';
import Profile from './component/page03/Profile';
import Front from './component/page03/Front';

const data = [
    {title : 'html', info :'HTML 입니다'},
    {title : 'css', info :'css 입니다'},
    {title : 'js', info :'js 입니다'},
    {title : 'jsp', info :'jsp 입니다'},
    {title : 'vue', info :'vue 입니다'}
]


const App03 = () => {
    return (
       <BrowserRouter>
        <>
            <ul>
                <li><Link to ='/'>Home</Link></li>
                <li><Link to ='/about'>about</Link></li>
                <li><Link to ='/profile'>profile</Link></li>

                <li><Link to='/front/html'>html</Link></li>
                <li><Link to='/front/css'>css</Link></li>
                <li><Link to='/front/js'>js</Link></li>
                <li><Link to='/front/react'>react</Link></li>
                <li><Link to='/front/vue'>vue</Link></li>

            </ul>
        </>

        <Routes>
                <Route path = '/' element={<Home></Home>}></Route>
                <Route path = '/about' element={<About></About>}></Route>
                <Route path = '/profile' element={<Profile></Profile>}></Route>
                <Route path = '/front/:name' element={<Front data={data}></Front>}></Route>
        </Routes>
       </BrowserRouter>
    );
};

export default App03;

/*
 :style 를 route path에 사용하면 useParams() 로 불러와 사용할 수 있다.
 : 뒤에 나오는 부분이 params의 key 부분이 되어 :name 는 name가 key가 되어 불러오고 있다.
*/