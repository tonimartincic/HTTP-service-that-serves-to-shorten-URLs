import axios from 'axios';
import * as types from '../actionTypes';

export default async function registerURL(URLRequest) {
  try {
    const response = await axios.post('/api/register', URLRequest);

    return {
      type: types.OPEN_ACCOUNT_SUCCESS,
      data: response.data,
    };
  } catch (err) {
    return {
      type: types.OPEN_ACCOUNT_FAILURE,
      data: err,
    };
  }
}
