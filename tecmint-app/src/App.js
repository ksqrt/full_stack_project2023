import logo from './logo.svg';
import './App.css';
import Dog from './Dog.js'
import Test1 from './test1.js'
import Test2 from './test2.js'

const App = () =>{
  
  let title = "신상명세서"
  const name = "홍길동"

  return (
 
    <div>
      <Dog></Dog>
      <Dog></Dog>
      <Test1></Test1>
      <Test2></Test2>
    </div>
  )
}



export default App;
