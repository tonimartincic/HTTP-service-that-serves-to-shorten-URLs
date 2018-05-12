import React, {Component} from 'react';
import {connect} from 'react-redux';
import {withRouter} from 'react-router-dom';
import openAccount from '../../../../redux/actionCreators/accountActionCreators';
import Register from './Register';

class RegisterContainer extends Component {
  constructor(props) {
    super(props);

    this.state = {
      accountId: '',
    };

    this.handleSubmit = this.handleSubmit.bind(this);
    this.handleChangeAccountId = this.handleChangeAccountId.bind(this);
    this.handleReset = this.handleReset.bind(this);
  }

  handleSubmit = (event) => {
    event.preventDefault();
    this.props.openAccount(this.state.accountId);
  };

  handleChangeAccountId = (event) => {
    this.setState({
      accountId: event.target.value,
    });
  };

  handleReset = () => {
    this.setState({
      accountId: '',
    });
  };

  render() {
    return (
      <Register
        accountId={this.state.accountId}
        handleChangeAccountId={event => this.handleChangeAccountId(event)}
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
    openAccount: accountId => dispatch(openAccount(accountId)),
  };
}

export default withRouter(connect(mapStateToProps, mapDispatchToProps)(RegisterContainer));
