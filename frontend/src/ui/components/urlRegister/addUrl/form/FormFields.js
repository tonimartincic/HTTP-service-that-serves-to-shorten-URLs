import React from 'react';
import {Row, Col, FormControl, ControlLabel, FormGroup} from 'react-bootstrap';

import styles from './formFields.css';

const FormFields = props => (
  <section>
    <Row>
      <Col>
        <section className={styles.section}>
          <FormGroup
            validationState={props.urlValidation}
          >
          <ControlLabel>URL</ControlLabel>
          <FormControl
            type='text'
            value={props.url}
            placeholder='URL'
            onChange={props.handleChangeUrl}
          />
          </FormGroup>
        </section>
      </Col>
    </Row>
    <Row>
      <Col>
        <section className={styles.section}>
          <ControlLabel>Redirect type</ControlLabel>
          <FormControl
            componentClass="select"
            placeholder="select"
            value={props.redirectType}
            onChange={props.handleChangeRedirectType}
          >
            <option value="select">Odaberi</option>
            <option value="301">301</option>
            <option value="302">302</option>
          </FormControl>
        </section>
      </Col>
    </Row>
  </section>
);

export default FormFields;
