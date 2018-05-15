import axios from "axios/index";
import * as types from "../actionTypes";

export async function getStatistics(AccountId) {
  try {
    const response = await axios.get(`/api/statistic/${AccountId}`);

    return {
      type: types.GET_STATISTICS_SUCCESS,
      data: response.data,
    };
  } catch (err) {
    return {
      type: types.GET_STATISTICS_FAILURE,
      data: err,
    };
  }
}

export async function getStatisticsForLoggedUser() {
  try {
    const response = await axios.get('/api/statistic');

    return {
      type: types.GET_STATISTICS_SUCCESS,
      data: response.data,
    };
  } catch (err) {
    return {
      type: types.GET_STATISTICS_FAILURE,
      data: err,
    };
  }
}
