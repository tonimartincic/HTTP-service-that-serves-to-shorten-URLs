import React from 'react';
import {Alert} from 'react-bootstrap';
import styles from './registeringURLResponse.css';

const RegisteringURLResponse = props => (
  <section className={styles.section}>
    <Alert bsStyle='success'>
      <h4>Short URL: {props.registeringURLResponse.shortUrl}</h4>
    </Alert>
  </section>
);

export default RegisteringURLResponse;
