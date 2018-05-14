import React, {Component} from 'react';
import {connect} from 'react-redux';
import {withRouter} from 'react-router-dom';
import AddURL from './AddURL';
import registerURL from '../../../../redux/actionCreators/URLActionCreators';

class AddURLContainer extends Component {
  constructor(props) {
    super(props);

    this.state = {
      url: '',
      redirectType: 'select',
      urlValidation: null,
    };

    this.handleSubmit = this.handleSubmit.bind(this);
    this.handleChangeUrl = this.handleChangeUrl.bind(this);
    this.handleChangeRedirectType = this.handleChangeRedirectType.bind(this);
    this.handleReset = this.handleReset.bind(this);
  }

  handleSubmit = (event) => {
    event.preventDefault();

    if (this.state.url == null || this.state.url.trim() === '') {
      this.setState({
        urlValidation: 'error',
      });

      return;
    }

    const URLRequest =
      {
        url: this.state.url,
        redirectType: this.state.redirectType === 'select' ? null: this.state.redirectType,
      };

    this.props.registerURL(URLRequest);
  };

  handleChangeUrl = (event) => {
    this.setState({
      url: event.target.value,
      urlValidation: null,
    });
  };

  handleChangeRedirectType = (event) => {
    this.setState({
      redirectType: event.target.value,
    });
  };

  handleReset = () => {
    this.setState({
      url: '',
      redirectType: 'select',
      urlValidation: null,
    });
  };

  render() {
    return (
      <AddURL
        url={this.state.url}
        redirectType={this.state.redirectType}
        handleChangeUrl={event => this.handleChangeUrl(event)}
        handleChangeRedirectType={event => this.handleChangeRedirectType(event)}
        handleSubmit={event => this.handleSubmit(event)}
        handleReset={event => this.handleReset(event)}
        urlValidation={this.state.urlValidation}
        registeringURLResponse={this.props.registeringURLResponse}
      />
    );
  }
}

function mapStateToProps(state) {
  return {
    registeringURLResponse: state.registeringURLResponse,
  };
}

function mapDispatchToProps(dispatch) {
  return {
    registerURL: URLRequest => dispatch(registerURL(URLRequest)),
  };
}

export default withRouter(connect(mapStateToProps, mapDispatchToProps)(AddURLContainer));
