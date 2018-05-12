import React from 'react';
import {Grid, Row, Col, Form} from 'react-bootstrap';
import FormFields from './FormFields';
import FormButtons from './FormButtons';
import styles from './register.css';

const Register = props => (
  <Grid className={styles.container}>
    <Form>
      <Row>
        <Col md={4} mdOffset={4}>
          <FormFields
            accountId={props.accountId}
            handleChangeAccountId={event => props.handleChangeAccountId(event)}
          />
          <FormButtons
            handleSubmit={event => props.handleSubmit(event)}
            handleReset={event => props.handleReset(event)}
          />
        </Col>
      </Row>
    </Form>
  </Grid>
);

export default Register;
