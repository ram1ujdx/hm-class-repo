import React, { useState } from 'react'

const Play = () => {

  const [value,updateValue] = useState(0)

  const incrementValue = ()=>{
    updateValue(+value+1)
  }

  return (
    <div>
    <h2>Current Value : {value}</h2>
    <input type={'text'} onChange={(e)=>updateValue(e.target.value)}/>
      <button onClick={incrementValue}>Increment</button>
    </div>
  )
}



export default Play
