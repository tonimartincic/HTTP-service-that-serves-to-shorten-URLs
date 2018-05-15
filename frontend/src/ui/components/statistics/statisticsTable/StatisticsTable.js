import React from 'react';
import {Grid, Row, Col, Table} from 'react-bootstrap';

const StatisticsTable = props => (
  <section>
    <Grid>
      <Row>
        <Col md={12}>
          <Table striped bordered condensed hover>
            <thead>
            <tr>
              <th>URL</th>
              <th>Number of redirects</th>
            </tr>
            </thead>
            <tbody>
              {props.tableData}
            </tbody>
          </Table>
        </Col>
      </Row>
    </Grid>
  </section>
);

export default StatisticsTable;
