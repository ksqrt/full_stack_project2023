import React from 'react';
import img01 from '../img/image01.jpg'
import img02 from '../img/image02.jpg'
import img03 from '../img/image03.jpg'
import img04 from '../img/image04.jpg'

const Test09 = () => {
    return (
        <div>
            <img src={img01} style={{width:200,height:200}}></img>          
            <img src={img02} style={{width:200,height:200}}></img>          
            <img src={img03} style={{width:200,height:200}}></img>          
            <img src={img04} style={{width:200,height:200}}></img>          
        </div>
    );
};

export default Test09;
/*
src 안에 있는 이미지 파일 처리는 참조변수를 사용한다.

  import 참조변수 from '이미지경로';
            <img src="img04" style={{width:200,height:200}}></img>          
*/