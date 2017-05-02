import React, {
  Component,
  PropTypes,
} from 'react'

const { func, object, string, oneOfType } = PropTypes

/**
  * Form component for Login and Register view
  */
class Form extends Component {
  static propTypes = {
    onSubmit: func.isRequired,
    errors: oneOfType([
      object,
      string,
    ]),
  }
  /**
    * handle submit form event
    * @param {SytheticEvent} e
    */
  handleSubmit = (e) => {
    e.preventDefault()
    const uid = this.refs.uid.value
    const pw = this.refs.pw.value
    this.props.onSubmit(uid, pw)
  }
  /**
    * render
    * @return {ReactElement} Form
    */
  render() {
    return (
      <form onSubmit={this.handleSubmit}>
        <div className="form-group">
          <label> Account </label>
          <input className="form-control" ref="uid" placeholder="Account"/>
        </div>
        <div className="form-group">
          <label>Password</label>
          <input ref="pw" type="password" className="form-control" placeholder="Password" />
        </div>
        {this.props.errors}
        <button type="submit" className="btn btn-primary">Login</button>
      </form>
    )
  }
}

export default Form
