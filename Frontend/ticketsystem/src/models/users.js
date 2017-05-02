import * as httpservice from './httpservice'


const requireAuth = (nextState, replace) => {

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

// user/logout
function userlogout(callback) {
        console.log("users logout");
        sessionStorage.clear();
        //observer.onSessionUpdate();
        callback(true);
    }

export {userlogin, requireAuth, userlogout};
