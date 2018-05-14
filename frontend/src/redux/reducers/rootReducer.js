import {combineReducers} from 'redux';
import accountReducer from "./accountReducer";
import openingAccountReducer from "./openingAccountReducer";
import URLReducer from "./URLReducer";
import statisticsReducer from "./statisticsReducer";

const rootReducer = combineReducers({
  account: accountReducer,
  openingAccountResponse: openingAccountReducer,
  registeringURLResponse: URLReducer,
  statistics: statisticsReducer,
});

export default rootReducer;
