import React from 'react';
import {Alert} from 'react-bootstrap';

const OpeningAccountResponse = props => (
  <Alert bsStyle={props.alertStyle} onDismiss={this.handleDismiss}>
  <h4>{props.openingAccountResponse.description}</h4>
  {/*<p>*/}
    {/*<Button bsStyle="danger">Take this action</Button>*/}
    {/*<span> or </span>*/}
    {/*<Button onClick={this.handleDismiss}>Hide Alert</Button>*/}
    {/*</p>*/}
  </Alert>
);

export default OpeningAccountResponse;
