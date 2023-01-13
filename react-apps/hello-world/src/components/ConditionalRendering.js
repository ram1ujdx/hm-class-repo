import React, { Component } from 'react'

export class ConditionalRendering extends Component {
    constructor(props) {
      super(props)
    
      this.state = {
         display:true
      }
    }
    
  render() {
    // let msg = this.state.display ? <h1>Hello</h1> : <h1>Bye</h1>

    let msg = this.state.display && <h1>Hello</h1>
    return (
      <div>
        {msg}
        {this.state.display}
        <button onClick={()=>this.changeDisplay()}>Click Me</button>
      </div>
    )
  }

  changeDisplay(){
    this.setState({
        display:!this.state.display
    })
  }

}

export default ConditionalRendering
