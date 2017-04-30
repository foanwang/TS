import React, {
  Component,
  PropTypes,
} from 'react'
import Form from './components/Form'
import * as userservice from '../../models/users'
const { object } = PropTypes

/**
  * Login view with email and password Firebase signIn
  */

class Login extends Component {
  constructor(props) {
        super(props);
        this.state = {
              userid: '',
              roleid:'',
              error: false,
        };
    }

  static contextTypes = {
    router: object.isRequired,
  }

  /**
    * handle submit form event
    * @param {SytheticEvent} e
    */
  handleSubmit = (userid, password) => {
    /**
      * handle signIn to firebase
      * @param {String} userid
      * @param {String} Password
      */
      userservice.userlogin(userid, password)
      .then(result=>{
        this.state.userid = result.user.userid;
        this.state.roleid = result.user.roleid;
        this.context.router.replace('/')
      }).catch(function(error) {
          this.state.error = true ;
        });

  }
  /**
    * render
    * @return {ReactElement} Login form
    */
  render() {
    const errors = this.state.error ? (<p> {this.state.error} </p>) : ''
    return (
      <div className="col-sm-6 col-sm-offset-3">
        <h1> Login </h1>
        <Form onSubmit={this.handleSubmit} errors={errors} />
      </div>
    )
  }
}

export default Login
