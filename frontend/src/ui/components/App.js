import React from 'react';
import {connect} from 'react-redux';
import {Route, Router} from 'react-router-dom';
import {history} from './history/history';
import LoginPage from './loginPage/LoginPage';
import URLRegister from './urlRegister/URLRegister';
import Statistics from './statistics/Statistics';
import Help from './help/Help';
import {getLoggedUser} from '../../redux/actionCreators/accountActionCreators';
import PrivateRoute from './route/PrivateRoute';
import styles from './app.css';

class App extends React.Component {
  componentDidMount() {
    this.props.getLoggedUser();
  }

  render() {
    return (
      <Router history={history}>
        <section className={styles.section}>
          <Route exact path='/login' component={LoginPage}/>
          <PrivateRoute exact path='/'><URLRegister/></PrivateRoute>
          <PrivateRoute exact path='/statistics'><Statistics/></PrivateRoute>
          <Route exact path='/help' component={Help}/>
        </section>
      </Router>
    );
  }
}

function mapStateToProps(state) {
  return {
    account: state.account,
  };
}

function mapDispatchToProps(dispatch) {
  return {
    getLoggedUser: () => dispatch(getLoggedUser()),
  };
}

export default connect(mapStateToProps, mapDispatchToProps)(App);
