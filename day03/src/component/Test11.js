import React, { useState } from 'react';

const datalist = [
    {id : 1, name :'chk1',text:'연령(만 14세 이상) 확인(필수)',ischk:false},
    {id : 2, name :'chk2',text:'개인정보 위탁 처리 동의(필수)',ischk:false},
    {id : 3, name :'chk3',text:'개인정보 수집 및 이용에 대한 동의 (필수)',ischk:false},
    {id : 4, name :'chk4',text:'이벤트 우대 혜택등에 대한 동의',ischk:false},
]



const Test11 = () => {
    // 상태변수 data 잡고 ,초기값으로는 datalist
    const [data,setData] = useState(datalist)
    const onCheck = (e)=>{
        const {name,checked} = e.target
        if(name === 'all'){
            setData(data.map(
                item => {
                    return {
                        ...item,
                        ischk: checked
                    }
                } 
    
            ))
        }else{
            setData(data.map(
                item => item.name === name ? {...item, ischk : checked}:item
            ))
        }
    }
    return (
        <div>
            <p>
                {/* true 가 아닌것이 몇개 1개 이상이면 채크 헤제  */}
                <input type = "checkbox" name="all" onChange={onCheck} checked={data.filter(item => item.ischk !== true).length < 1 }></input>
                <label>약관동의</label>
                <hr></hr>
                {
                    data.map(item =>
                        <p key={item.id}>
                            <input type = "checkbox" name={item.name} checked ={item.ischk} onChange={onCheck}></input>
                            <label>{item.text}</label>
                        </p>)
                }
            </p>
        </div>
    );
};

export default Test11;