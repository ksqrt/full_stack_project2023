import axios from 'axios';
import React, { useEffect, useState } from 'react';
import { useNavigate, useParams } from 'react-router-dom';

const MemberDetail = () => {
    const { memberId } = useParams()
    const [member, setMember] = useState({});
    const { name, email, phone, website } = member;

    const navigate = useNavigate()

    useEffect(() => {
        axios
            .get(`https://jsonplaceholder.typicode.com/users/${memberId}`)
            .then(res => setMember(res.data));
    }, []);

    const css = {
        border: '1px solid cyan', margin: 20, padding: 20
    }

    const onBack = () => {
        // navigate('/')
        navigate(-1)
    }

    return (
        <div style={css}>
            <h2>MemberDetail Page : {memberId}</h2>
            <h4>이름 :  {name}</h4>
            <ul>
                <li>이메일 : {email}</li>
                <li>전화번호 : {phone}</li>
                <li>웹사이트 : {website}</li>
            </ul>
            <button onClick={ onBack }>뒤로</button>
        </div>
    );
};

export default MemberDetail;