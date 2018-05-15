import React from 'react';
import NavigationBar from '../navigationBar/NavigationBar';
import URLRegisterHeader from './header/URLRegisterHeader';
import AddURLContainer from './addUrl/AddURLContainer';

const URLRegister = () => (
  <section>
    <NavigationBar/>
    <URLRegisterHeader/>
    <AddURLContainer/>
  </section>
);

export default URLRegister;
