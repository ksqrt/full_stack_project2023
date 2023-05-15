import React, { useEffect, useReducer } from 'react';
import axios from 'axios';
import Member from './Member';

const Main = () => {
  const initialState = {
    data: [],
    error: null,
    loading: true,
  };

  useEffect(() => {
    const url = `https://jsonplaceholder.typicode.com/users`;
    axios
      .get(url)
      .then((res) => {
        dispatch({ type: 'SUCCESS', payload: res.data });
      })
      .catch((error) => {
        dispatch({ type: 'ERROR' });
      });
  }, []);

  const reducer = (state, action) => {
    switch (action.type) {
      case 'SUCCESS':
        return {
          data: action.payload,
          error: null,
          loading: false,
        };
      case 'ERROR':
        return {
          data: [],
          error: 'ERROR',
          loading: true,
        };
      default:
        return state;
    }
  };

  const [state, dispatch] = useReducer(reducer, initialState);

  return (
    <div>
      <h1>Main Page / 회원수 : {state.data.length}</h1>
      <h2>
        {state.loading ? '로딩중' : '로딩완료'}
        {state.data.map((item, index) => (
          <div key={index}>
            <p>
                <Member key={item.id} item={item}></Member>
            </p>
          </div>
        ))}
      </h2>
    </div>
  );
};

export default Main;
