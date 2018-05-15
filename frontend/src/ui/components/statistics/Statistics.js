import React from 'react';
import {connect} from 'react-redux';
import NavigationBar from '../navigationBar/NavigationBar';
import StatisticsHeader from './header/StatisticsHeader';
import StatisticsTableContainer from './statisticsTable/StatisticsTableContainer';

const Statistics = () => (
  <section>
    <NavigationBar/>
    <StatisticsHeader/>
    <StatisticsTableContainer/>
  </section>
);

function mapStateToProps(state) {
  return {
    statistics: state.statistics,
  };
}

function mapDispatchToProps() {
  return {};
}

export default connect(mapStateToProps, mapDispatchToProps)(Statistics);
