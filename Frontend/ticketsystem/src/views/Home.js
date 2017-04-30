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
    currentUser: sessionStorage.getItem("uid")
  }
  componentDidMount = () => {
      this.setState({ currentUser: sessionStorage.getItem("uid") })
    }
  /**
    * render
    * @return {ReactElement} Hello screen
    */
  render() {
    let user = 'World'
    if (this.state.currentUser) {
      user = this.state.currentUser;
    }
    const msg = (
      <h1> Hello {user}! </h1>
    )
    return msg
    this.context.router.replace('/')
  }
}

export default Home
