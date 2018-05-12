import React from 'react';
import {Grid, Row, Col, Form} from 'react-bootstrap';
import LoginHeader from './LoginHeader';
import FormFields from './FormFields';
import FormButtons from './FormButtons';
import styles from './login.css';

const Login = props => (
  <Grid className={styles.container}>
    <Form>
      <Row>
        <Col md={4} mdOffset={4}>
          <LoginHeader/>
          <FormFields
            accountId={props.accountId}
            password={props.password}
            handleChangeAccountId={event => props.handleChangeAccountId(event)}
            handleChangePassword={event => props.handleChangePassword(event)}
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

export default Login;
