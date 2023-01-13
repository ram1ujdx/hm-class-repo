import React from 'react'
import Trainee from './Trainee'

function ListRendering() {

   // let trainees = ['Mohan','Sanjan','Puja','Usha']

   let trainees =[
    {
        id:1001,
        traineeName:'Suraj',
        age:25
    },
    {
        id:1002,
        traineeName:'Karan',
        age:22
    },
    {
        id:1003,
        traineeName:'Harsh',
        age:26
    }
    

   ]

  return (
    <div>
    {/* <ul>
      {trainees.map(t=><li>{t.traineeName} - {t.age}</li>)}
    </ul> */}

    <table className='table table-bordered table-dark'>
    <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Age</th>
        </tr>
    </thead>
    <tbody>
        {trainees.map(t=><Trainee key={t.id} trainee={t}/>)}
    </tbody>
    </table>

    </div>
  )
}

export default ListRendering
