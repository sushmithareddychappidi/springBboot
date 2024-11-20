import React, { Component } from 'react'

export default class LifeChild extends Component {
    componentWillUnmount(){
        console.log("component will unmount");
    }
  render() {
    return (
      <div>LifeChild</div>
    )
  }
}
