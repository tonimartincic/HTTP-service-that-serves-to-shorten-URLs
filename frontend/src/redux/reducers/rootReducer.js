import {combineReducers} from 'redux';
import accountReducer from "./accountReducer";
import URLReducer from "./URLReducer";
import statisticsReducer from "./statisticsReducer";

const rootReducer = combineReducers({
  account: accountReducer,
  url: URLReducer,
  statistics: statisticsReducer,
});

export default rootReducer;
