import React, {Component} from 'react';
import {connect} from 'react-redux';
import {withRouter} from 'react-router-dom';
import {getStatisticsForLoggedUser} from '../../../../redux/actionCreators/statisticsActionCreators';
import StatisticsTable from './StatisticsTable';

class StatisticsTableContainer extends Component {
  componentDidMount() {
    this.props.getStatisticsForLoggedUser();
  }

  render() {
    const tableData = [];
    let i = 0;
    for ( let record in this.props.statistics ) {
      tableData[i] =
        (
          <tr key={i}>
            <td>{record}</td>
            <td>{this.props.statistics[record]}</td>
          </tr>
        );
      i++;
    }

    return (
      <StatisticsTable
        tableData={tableData}
      />
    );
  }
}

function mapStateToProps(state) {
  return {
    statistics: state.statistics,
  };
}

function mapDispatchToProps(dispatch) {
  return {
    getStatisticsForLoggedUser: () => dispatch(getStatisticsForLoggedUser()),
  };
}

export default withRouter(connect(mapStateToProps, mapDispatchToProps)(StatisticsTableContainer));
