import React, {
  Component,
  PropTypes,
} from 'react'

const { object } = PropTypes

/**
  * Registration view with email and password Firebase signUp
  */

class Ticket extends Component {
  static contextTypes = {
    router: object.isRequired,
  }
  /**
    * @type {object}
    * @property {boolean} 
    */
  state = {
    error: false,
  }
  /**
    * handle submit form event
    * @param {String} uid
    * @param {String} roleid
    */
  handleSubmit = (uid, roleid) => {
    /**
      * handle createUser to firebase
      * @param {String} uid
      * @param {String} roleid (at least 6 characters)
      */
    // firebase.auth().createUserWithEmailAndPassword(email, pw)
    // .then(result => {
    //   /**
    //     * redirect to Home screen after success
    //     */
    //   this.context.router.replace('/')
    // })
    // .catch(e => {
    //   /**
    //     * update error message
    //     */
    //   const error = e.message
    //   this.setState({ error })
    //})
  }

  /**
    * render
    * @return {ReactElement} Registration form
    */
  render() {
    // const errors = this.state.error ? (<p> {this.state.error} </p>) : ''
    // return (
    //   <div className='col-sm-6 col-sm-offset-3'>
    //     <h1> Ticket </h1>
    //     <Form onSubmit={this.handleSubmit} errors={errors} />
    //   </div>
    //)
  }
}

export default Ticket
