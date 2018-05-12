import React from 'react';

import LoginContainer from './login/LoginContainer';
import RegisterContainer from './register/RegisterContainer';
import styles from './startPage.css';

const StartPage = () => (
  <section className={styles.section}>
    <LoginContainer/>
    <RegisterContainer/>
  </section>
);

export default StartPage;
