import initialState from '../initialState';
import * as types from '../actionTypes';

export default function openingAccountReducer(state = initialState.openingAccountResponse, action) {
  switch (action.type) {
    case types.OPEN_ACCOUNT_SUCCESS:
      return Object.assign({}, action.data);

    case types.OPEN_ACCOUNT_FAILURE:
      return Object.assign({}, state);

    case types.SET_OPENING_ACCOUNT_RESPONSE:
      return null;

    default:
      return state;
  }
}
