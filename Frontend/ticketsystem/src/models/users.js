import * as httpservice from './httpservice'


const requireAuth = (nextState, replace) => {
  /**
    * if user is not logged in hence will redirect to Login screen
    */
  // if (sessionStage.getItem("uid") === null) {
  //   replace({
  //     pathname: '/login',
  //     state: { nextPathname: nextState.location.pathname },
  //   })
  // }
}

// user/login
function userlogin(userid, password) {
    let userData = {
        userid,
        password
    };
    return httpservice.post('login', userData)
    .then(result=>{
      return result.json();
    }).catch(e => {

    })
}

export {userlogin, requireAuth};
