import React from 'react'

function Trainee({trainee}) {
  return (
    <tr>
        <td>{trainee.id}</td>
        <td>{trainee.traineeName}</td>
        <td>{trainee.age}</td>
    </tr>
  )
}

export default Trainee
