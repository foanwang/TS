import React, { Component } from 'react'
import * as userservice from '../../models/users'

/**
  * Logout view with signOut action from Firebase
  */

class Logout extends Component {
    constructor(props) {
        super(props);
        this.logout();
    }

    logout() {
          userservice.userlogout(this.onSubmitResponse.bind(this));
      }

      onSubmitResponse(response) {
          console.log("onSubmitResponse response:"+response);
          if (response === true) {
            //this.context.router.push('/');
          } else {
              // Something went wrong, let the user know
          }
      }

  /**
    * render
    * @return {ReactElement} Logout screen
    */
  render() {
    return (
      <p>You are now logged out</p>
    )
  }
}

export default Logout
