import React, {Component} from 'react';
import {connect} from 'react-redux';
import {withRouter} from 'react-router-dom';
import validateAccount from '../../../../redux/actionCreators/accountActionCreators';
import {login} from '../../../../redux/actionCreators/accountActionCreators';
import Login from './Login';

class LoginContainer extends Component {
  constructor(props) {
    super(props);

    this.state = {
      accountId: '',
      password: '',
    };

    this.handleSubmit = this.handleSubmit.bind(this);
    this.handleChangeAccountId = this.handleChangeAccountId.bind(this);
    this.handleChangePassword = this.handleChangePassword.bind(this);
    this.handleReset = this.handleReset.bind(this);
  }

  handleSubmit = (event) => {
    event.preventDefault();

    const account = {
      username: this.state.accountId,
      password: this.state.password,
    };

    this.props.validateAccount(account)
      .then(() => this.props.login());
  };

  handleChangeAccountId = (event) => {
    this.setState({
      accountId: event.target.value,
    });
  };

  handleChangePassword = (event) => {
    this.setState({
      password: event.target.value,
    });
  };

  handleReset = () => {
    this.setState({
      accountId: '',
      password: '',
    });
  };

  render() {
    return (
      <Login
        accountId={this.state.accountId}
        password={this.state.password}
        handleChangeAccountId={event => this.handleChangeAccountId(event)}
        handleChangePassword={event => this.handleChangePassword(event)}
        handleSubmit={event => this.handleSubmit(event)}
        handleReset={event => this.handleReset(event)}
      />
    );
  }
}

function mapStateToProps() {
  return {
  };
}

function mapDispatchToProps(dispatch) {
  return {
    validateAccount: account => dispatch(validateAccount(account)),
    login: () => dispatch(login()),
  };
}

export default withRouter(connect(mapStateToProps, mapDispatchToProps)(LoginContainer));
