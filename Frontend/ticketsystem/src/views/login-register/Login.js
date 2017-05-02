import React, {
  Component,
  PropTypes,
} from 'react'
import Form from './components/Form'
import * as userservice from '../../models/users'
const { object } = PropTypes


class Login extends Component {
  constructor(props) {
        super(props);
        this.state = {
              uid: '',
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
        this.state.userid = result.user.uid;
        sessionStorage.setItem("uid",result.user.uid);
        sessionStorage.setItem("roleid",result.user.roleid);
        this.context.router.push('/');
      }).catch(function(error) {
          console.log(error);
        });

  }



  componentDidMount = () => {
      //this.context.router.push('/');
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
