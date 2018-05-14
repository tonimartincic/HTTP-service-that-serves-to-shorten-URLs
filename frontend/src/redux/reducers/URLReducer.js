import initialState from '../initialState';
import * as types from "../actionTypes";

export default function URLReducer(state = initialState.registeringURLResponse, action) {
  switch (action.type) {
    case types.REGISTER_URL_SUCCESS:
      return Object.assign({}, action.data);

    case types.REGISTER_URL_FAILURE:
      return Object.assign({}, state);

    default:
      return Object.assign({}, state);
  }
}
