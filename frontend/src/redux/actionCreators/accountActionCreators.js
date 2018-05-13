import axios from 'axios';
import * as types from '../actionTypes';
import {history} from '../../ui/components/history/history';

export default async function openAccount(accountId) {
  try {
    const response = await axios.post('/account', {accountId});

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
    const response = await axios.post('/account/validate', `username=${account.username}&password=${account.password}`, {headers: {
        'Content-Type': 'application/x-www-form-urlencoded'
      },});

    debugger;
    history.push('/url-register');

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
