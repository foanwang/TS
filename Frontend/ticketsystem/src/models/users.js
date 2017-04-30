import * as httpservice from './httpservice'

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
function checkLogin(){
  return this.userdat.username;
}

export {userlogin};
