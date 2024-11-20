import React, {PureComponent } from 'react'

export default class Pure extends PureComponent {
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
