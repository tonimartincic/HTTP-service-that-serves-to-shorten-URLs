import {Nav, Navbar, NavItem} from 'react-bootstrap';
import {Link} from 'react-router-dom';
import React, {Component} from 'react';
import {connect} from 'react-redux';
import styles from './navigationBar.css';

class NavigationBar extends Component {
  render() {
    return (
      <Navbar className={styles.navBar}>
        <Navbar.Header className={styles.navCenter}>
          <Navbar.Brand>
            <section className={styles.sectionTitle}>
              <span className={styles.letter} data-letter="U">U</span>
              <span className={styles.letter} data-letter="R">R</span>
              <span className={styles.letter} data-letter="L">L</span>
              <span className={styles.letter} data-letter="-">-</span>
              <span className={styles.letter} data-letter="s">s</span>
              <span className={styles.letter} data-letter="h">h</span>
              <span className={styles.letter} data-letter="o">o</span>
              <span className={styles.letter} data-letter="r">r</span>
              <span className={styles.letter} data-letter="t">t</span>
              <span className={styles.letter} data-letter="e">e</span>
              <span className={styles.letter} data-letter="n">n</span>
              <span className={styles.letter} data-letter="e">e</span>
              <span className={styles.letter} data-letter="r">r</span>
            </section>
          </Navbar.Brand>
        </Navbar.Header>
        <Nav className={styles.navCenter}>
          <NavItem
            componentClass={Link}
            to='/url-register'
            href='/url-register'
          >
              <span className={styles.span}>
                <span className='glyphicon glyphicon-upload'/> URL register
              </span>
          </NavItem>
          {/*<NavItem>*/}
              {/*<span className={styles.spanNoHover}>*/}
                 {/*<span*/}
                   {/*className='glyphicon glyphicon-user'/> {this.props.userData.firstName + ' ' + this.props.userData.lastName}*/}
              {/*</span>*/}
          {/*</NavItem>*/}
        </Nav>
      </Navbar>
    );
  }
}

function mapStateToProps(state) {
  return {
    // userData: state.userData,
  };
}

function mapDispatchToProps() {
  return {};
}

export default connect(mapStateToProps, mapDispatchToProps)(NavigationBar);
