import React, { Component } from 'react'


/**
  * Logout view with signOut action from Firebase
  */

class Logout extends Component {
    constructor(props) {
        super(props);
        this.logout();
    }

    logout() {
      sessionStorage.clear();
    }

  /**
    * render
    * @return {ReactElement} Logout screen
    */
  render() {
    return (
      <p>You are now logged out</p>
    )
    this.context.router.replace('/')
  }
}

export default Logout
