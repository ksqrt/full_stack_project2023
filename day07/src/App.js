import React from 'react';
import App01 from './App01.js';
// import App02 from './App02.js';
import App03 from './App03.js';
import App04 from './App04.js';
import App05 from './App05.js';
/*
React-Router

1. 리액트는 SPA (Single Page Application) 방식이다.
일반적으로 클라이언트가 요청을 하면 서버에서 요청한 페이지를 보여준다.그러면서 로딩되는 모습이 보인다.
하지만 리액트는 모든 문서를 다 읽어드린 다음 클라이언트가 요청을 하면 로딩을 하지 않고 바로 보여주기 때문에 속도가 빠르다.

- 기존 웹 페이지처럼 여러 개의 페이지를 사용하며 새로운 페이지를 로드 하는 기존의 MPA 방식이 아니다.
- 새로운 페이지를 로드하지 않고 하나의 페이지 안에서 필요한 데이터만 가져오는 형태를 가진다.

2. 사용자가 입력한 주소를 감지하는 역할을 하며, 여러 환경에서 동작할 수 있도록 여러 종류의 
라우터 컴포넌트를 제공한다. 
이중 가장 많이 사용하는 라우터 컴포넌트는 BrowserRouter와 HashRouter이다.

[설치]
npm install react-router-dom
yarn add react-router-dom

# react-router-dom 변경사항 (2021. 11. 25 기준) 
 1. Route 컴포넌트를 이제는 Routes 컴포넌트로 필히 감싸주어야 한다.
 2. Route 컴포넌트의 매개변수 compent 가 element 로 바뀌었다.
 3. useHistory 사라짐 -> useNavigate 함수
 4. history.push('/') -> navigate('/')

Route : 어떤 경로로 들어왔을 때 어떤 컴포넌트를 보여 주겠다
Link : Router의 주소를 바꿈, a 태그지만 새로 고침이 안 된다.

:style 를 route path에 사용하면 useParams() 로 불러와 사용할 수 있다.
: 뒤에 나오는 부분이 params의 key 부분이 되어 :name 는 name가 key가 되어 불러오고 있다.

1. Link
- 클릭 시 바로 이동하는 로직 구현 시에 사용 용이
  ex) 상품 리스트에서 상세 페이지 이동 시
- react-router-dom 에서 제공하는 Link 컴포넌트는 DOM 에서 a 태그로 변환이 된다.
- a 태그와 Link 차이
  a : 외부 프로젝트로 이동하는 경우
  Link : 프로젝트 내에서 페이지 전환하는 경우

2. useNavigate
- useNavigate 훅을 실행하면 페이지 이동을 할 수 있게 해주는 함수를 반환한다.
  반환하는 함수를 navigate라는 변수에 저장 후 navigate의 인자로 설정한 path 값을 넘겨주면 
  해당 경로로 이동할 수 있다.
- 페이지 전환 시 추가로 처리해야 하는 로직이 있으면 useNavigate 사용
  ex) 로그인 버튼 클릭 시
      회원가입 되어 있는 사용자 -> Main 페이지로 이동
      회원가입이 되어 있지 않은 사용자 -> SignUp 페이지로 이동

Index Routes
- Route 에 들어가는 index 라는 값은 default child routes 라고 생각하면 된다
- 부모에 여러 개의 자식 route 있는 경우 부모 경로에서 + '/' 인 경우 설정
*/


const App = () => (
  <div>
    {/* <App01></App01> */}
    {/* <App02></App02> */}
    {/* <App03></App03> */}
    {/* <App04></App04> */}
    <App05></App05>
  </div>
);

export default App;