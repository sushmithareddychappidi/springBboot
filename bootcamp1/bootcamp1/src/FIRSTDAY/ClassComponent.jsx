import React from "react";
export default class ClassComponent extends React.Component
{
    // render()
    // {
    //     return <h1>first class based component</h1>
    // }

    state={
        counter:0,
    }
    decrement=()=>{
        this.setState({counter:this.state.counter-1})
    }
    increment=()=>{
        this.setState({counter:this.state.counter+1})
    }
    reset=()=>{
        this.setState({counter:this.state.counter=0})
    }
    render()
    {
        return <div>
            <h2>{this.state.counter}</h2>
            <button onClick={this.decrement}>decrement</button>
            <button onClick={this.increment}>INCREMENT</button>
            <button onClick={this.reset}>reset</button>
        </div>
    }
}