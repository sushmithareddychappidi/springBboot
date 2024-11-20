
import React, { Component } from 'react';
import Child from "./Child"

export default class ParentComponent extends Component {
    state={
        name:"chintu"
    }
    changeName=()=>{
        this.setState({name:"chintu"})
    }
  render() {
    console.log("Parent rendered");
    return (
      <div>
        <Child name={this.state.name}/>
        <button onClick={this.changeName}>change</button>
      </div>
    )
  }
}