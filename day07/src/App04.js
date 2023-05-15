import React from 'react';
import {BrowserRouter, Link, Route, Routes} from 'react-router-dom'
import Main from './component/page04/Main';
import MemberDetail from './component/page04/MemberDetail';


const App04 = () => {
    return (
        <div>
            <BrowserRouter>
                {/* 화면에 보이는 영역 */}
                <Routes>
                    <Route path ='/' element = {<Main></Main>}></Route>
                    <Route path ='/' element = {<Main></Main>}></Route>
                    <Route path ='/' element = {<Main></Main>}></Route>
                    <Route path = '/member'>
                        <Route path = ":memberId" element = {<MemberDetail></MemberDetail>}></Route>
                    </Route>
                </Routes>
            </BrowserRouter>            
        </div>
    );
};

export default App04;