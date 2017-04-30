import React, { Component } from 'react'
import {
  Link,
 } from 'react-router'

/**
  * Main view of navigation bar
  */

class Main extends Component {
  /**
    * @type {object}
    * @property {boolean} loggedIn status
    */
  state = {
     loggedIn: (sessionStorage.getItem("uid") !== null),
  }

  componentWillMount = () => {
    /**
      * update loggedIn state whenever Firebase AuthStateChanged
      */
      this.setState({ loggedIn: (sessionStorage.getItem("uid") !== null)})

      if (sessionStorage.getItem("uid")) {
        console.log('Logged IN', sessionStorage.getItem("uid"))
      } else {
        console.log('Not logged in')
      }

    }

  /**
    * render
    * @return {ReactElement} Navigation bar
    */
  render() {
    let loginOrOut
    let register
    if (this.state.loggedIn) {
      loginOrOut = (
        <li>
          <Link to="/logout" className="navbar-brand">Logout</Link>
        </li>
      )
      register = null
    } else {
      loginOrOut = (
        <li>
          <Link to="/login" className="navbar-brand">Login</Link>
        </li>
      )
    }
    return (
      <span>
        <nav className="navbar navbar-default navbar-static-top">
          <div className="container">
            <div className="navbar-header">
              <Link to="/" className="navbar-brand">
                  Ticket System
              </Link>
            </div>
            <ul className="nav navbar-nav pull-right">
              <li>
                <Link to="/" className="navbar-brand">
                    Home
                </Link>
              </li>
              {register}
              {loginOrOut}
            </ul>
          </div>
        </nav>
        <div className="container">
          <div className="row">
            {this.props.children}
          </div>
        </div>
      </span>
    )
  }
}

export default Main
