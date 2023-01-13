import React from 'react'
import Profile from './Profile'

 const Greet = (props)=> {
  return (
    <div>
    <button onClick={()=>fun()} className='btn btn-primary'>Click Me</button>
    <h1>{props.message}</h1>
    <Profile username={'Mayank'} />
    </div>
  )
}

function fun(){
  alert("Button Clicked!!!")
}

export default Greet