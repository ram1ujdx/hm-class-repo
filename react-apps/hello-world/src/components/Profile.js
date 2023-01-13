import React, { Component } from 'react'

export class Profile extends Component {

    constructor(){
        super();
        this.state={
            age:25,
            city:'Bangalore'
        }
    }


    changeCity(city='Delhi'){
      this.setState(
        {
          city:city
        }
      )
    }

  render() {
    setTimeout(()=>{
        this.setState({
            age:30
        })
    },5000)
    return (
      <>
        <h2>Name : {this.props.username}</h2>
        <h2>Here is my Profile</h2>
        <h3>Age : {this.state.age}</h3>
        <h3>City : {this.state.city}</h3>
        <input type={'text'} onChange={(event)=>this.changeCity(event.target.value)} />
        <button onClick={()=>this.changeCity()}>Change City</button>
      </>
    )
  }
}

export default Profile
