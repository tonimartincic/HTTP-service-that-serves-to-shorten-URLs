import React from 'react';
import {connect} from 'react-redux';
import {Route, Router} from 'react-router-dom';
import {history} from './history/history';
import StartPage from './startPage/StartPage';
import styles from './app.css';

class App extends React.Component {
  render() {
    return (
      <Router history={history}>
        <section className={styles.section}>
          <Route exact path='/login' component={StartPage}/>
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
