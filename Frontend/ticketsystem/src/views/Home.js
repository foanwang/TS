import React, { Component } from 'react'

/**
  * Home view
  */

class Home extends Component {
  /**
    * @type {object}
    * @property {string} username / email
    */
  state = {
    //currentUser: firebase.auth().currentUser,
  }
  componentDidMount = () => {
    /**
      * update currentUser whenever Firebase AuthStateChanged
      */
    //(firebaseUser => {
    //   this.setState({ currentUser: firebaseUser })
    // })
  }
  /**
    * render
    * @return {ReactElement} Hello screen
    */
  render() {
    let user = 'World'
    if (this.state.currentUser) {
      user = this.state.currentUser.email
    }
    const msg = (
      <h1> Hello {user}! </h1>
    )
    return msg
  }
}

export default Home
