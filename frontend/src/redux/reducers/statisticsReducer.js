import initialState from '../initialState';

export default function statisticsReducer(state = initialState.statistics, action) {
  switch (action.type) {
    default:
      return Object.assign({}, state);
  }
}
