import React from 'react'
import {
  Router,
  Route,
  hashHistory,
  IndexRoute,
} from 'react-router'

import Main from '../views/Main'
import Login from '../views/login-register/Login'
import Logout from '../views/login-register/Logout'
import Register from '../views/login-register/Register'
import Ticket from '../views/login-register/Ticket'
import Home from '../views/Home'
import * as userservice from '../models/users'
/**
  * routes configuration for views
  */
export default (
  <Router history={hashHistory}>
    <Route path='/' component={Main}>
      <IndexRoute component={Home} />
      <Route path='login' component={Login} />
      <Route path='ticket' component={Ticket}/>
      <Route path='logout' component={Logout}/>
      <Route path='register' component={Register} />
    </Route>
  </Router>
)
