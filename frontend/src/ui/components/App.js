import React from 'react';
import {connect} from 'react-redux';
import {Route, Router} from 'react-router-dom';
import {history} from './history/history';
import LoginPage from './loginPage/LoginPage';
import URLRegister from './urlRegister/URLRegister';
import Statistics from './statistics/Statistics';
import Help from './help/Help';
import styles from './app.css';

class App extends React.Component {
  render() {
    return (
      <Router history={history}>
        <section className={styles.section}>
          <Route exact path='/login' component={LoginPage}/>
          <Route exact path='/url-register' component={URLRegister}/>
          <Route exact path='/statistics' component={Statistics}/>
          <Route exact path='/help' component={Help}/>
          <Route exact path='/' component={LoginPage}/>
        </section>
      </Router>
    );
  }
}

function mapStateToProps() {
  return {};
}

function mapDispatchToProps() {
  return {};
}

export default connect(mapStateToProps, mapDispatchToProps)(App);
