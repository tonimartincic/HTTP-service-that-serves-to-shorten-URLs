import React from 'react';

import LoginContainer from './login/LoginContainer';
import RegisterContainer from './register/RegisterContainer';
import styles from './loginPage.css';

const LoginPage = () => (
  <section className={styles.section}>
    <LoginContainer/>
    <RegisterContainer/>
  </section>
);

export default LoginPage;
