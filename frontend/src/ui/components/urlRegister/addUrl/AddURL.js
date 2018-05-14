import React from 'react';
import {Form, Row, Col} from 'react-bootstrap';
import AddURLHeader from './header/AddURLHeader';
import FormFields from './form/FormFields';
import FormButtons from './form/FormButtons';
import RegisteringURLResponse from './registeringUrlResponse/RegisteringURLResponse';
import * as util from '../../../../utils/Util';

const AddURL = props => (
  <Row>
    <Col md={4} mdOffset={4}>
      <Form>
        <AddURLHeader/>
        <FormFields
          url={props.url}
          redirectType={props.redirectType}
          handleChangeUrl={event => props.handleChangeUrl(event)}
          handleChangeRedirectType={event => props.handleChangeRedirectType(event)}
          urlValidation={props.urlValidation}
        />
        <FormButtons
          handleSubmit={event => props.handleSubmit(event)}
          handleReset={event => props.handleReset(event)}
        />
        <Choose>
          <When condition={props.registeringURLResponse != null && !util.isEmpty(props.registeringURLResponse)}>
            <RegisteringURLResponse
              registeringURLResponse={props.registeringURLResponse}
            />
          </When>
        </Choose>
      </Form>
    </Col>
  </Row>
);

export default AddURL;
