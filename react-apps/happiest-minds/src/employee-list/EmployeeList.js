import React, { useState } from 'react'
import 'bootstrap/dist/css/bootstrap.min.css'
import axios from 'axios'




const EmployeeList = ({employee,setEmployee}) => {

  // const [emp,setEmployee]=useState()

  return (
    <tr>
        <td>{employee.employeeId}</td>
        <td>{employee.employeeName}</td>
        <td>{employee.email}</td>
        <td>{employee.joinDate}</td>
        <td><button className='btn btn-outline-danger' onClick={()=>deleteEmployee(employee.employeeId)}>Delete</button></td>
        <td><button className='btn btn-outline-primary' onClick={()=>setEmployee(employee)}>Update</button></td>
    </tr>
  
    
  )
}

const deleteEmployee = (id)=>{
  axios.delete(`http://localhost:8500/employees/${id}`).then(
    (response) => {
      alert('Deleted')
  
    }
  )
  .catch(()=>alert("Unable to delete"))

}


export default EmployeeList
