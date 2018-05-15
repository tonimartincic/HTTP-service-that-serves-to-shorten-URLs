import initialState from '../initialState';
import * as types from "../actionTypes";

export default function statisticsReducer(state = initialState.statistics, action) {
  switch (action.type) {
    case types.GET_STATISTICS_SUCCESS:
      return Object.assign({}, action.data);

    case types.GET_STATISTICS_FAILURE:
      return Object.assign({}, state);

    default:
      return Object.assign({}, state);
  }
}
