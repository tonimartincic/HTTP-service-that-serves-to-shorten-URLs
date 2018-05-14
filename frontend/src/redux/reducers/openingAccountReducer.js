import initialState from '../initialState';
import * as types from '../actionTypes';

export default function openingAccountReducer(state = initialState.openingAccountResponse, action) {
  switch (action.type) {
    case types.OPEN_ACCOUNT_SUCCESS:
      return action.data;

    default:
      return state;
  }
}
