import axios from 'axios';
import * as types from '../actionTypes';

export default async function registerURL(URLRequest) {
  try {
    const response = await axios.post('/api/register', URLRequest);

    return {
      type: types.REGISTER_URL_SUCCESS,
      data: response.data,
    };
  } catch (err) {
    return {
      type: types.REGISTER_URL_FAILURE,
      data: err,
    };
  }
}
