import React, { Component } from 'react'

export default class LearPureComponent extends Component {
    state={
        sub:"react"
    }
    changeSub=()=>{
        this.setState({sub:"react"})
    }
  render() {
    console.log("component rendering");
    return (
      <div>
        <h2>{this.state.sub}</h2>
        <button onClick={this.changeSub}>change</button>
      </div>
    )
  }
}
