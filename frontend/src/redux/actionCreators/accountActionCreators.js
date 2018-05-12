import axios from 'axios';
import * as types from '../actionTypes';

export default async function openAccount(accountId) {
  try {
    const response = await axios.get('/api/account', accountId);

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

export async function validateAccount(account) {
  try {
    const response = await axios.post('/api/account/validate', account);

    return {
      type: types.VALIDATE_ACCOUNT_SUCCESS,
      data: response.data,
    };
  } catch (err) {
    return {
      type: types.VALIDATE_ACCOUNT_FAILURE,
      data: err,
    };
  }
}
