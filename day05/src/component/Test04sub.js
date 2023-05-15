import React, { useMemo } from 'react';

const getColor = (color) =>{
    console.log('getColor')
    
    switch (color) {
        case 'hotpink':
            return '분홍'
        case 'magenta' :
            return '보라색'
        case 'skyblue':
            return '하늘색'
        case 'tomato' : 
            return '토마토'
        }

}
const getFood = (food) =>{
    console.log('getFood')
    
    switch (food) {
        case '햄버거':
            return '인스턴트'
        case '삼겹살' :
            return '고기'
        case '치킨':
            return '닭고기'
        case '짜장면' : 
            return '면요리'
        }

}


const Test04sub = ({color,food}) => {
    // color 를 선택하건, food 를 선택하건 로그가 모두 찍힘
    // 해결방법 : color 선택 = getColor 만 되게끔 !

    const colorInfo = useMemo((color)=>{
        getColor(color)
    },[color])
    const foodInfo = useMemo((food)=>{
        getFood(food)
    },[food])
    
    return (
        <div>
            <h3>선택한 색 : {color}</h3>
            <h4> 당신운 {colorInfo} 를 좋아하시는군요</h4>

            <h3>선택한 음식 : {food}</h3>
            <h4> 당신은 {foodInfo} 를 좋아하시는군요</h4>
        </div>
    );
};

export default Test04sub;