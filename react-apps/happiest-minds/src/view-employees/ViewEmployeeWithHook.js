import axios from 'axios'
import React, { useEffect, useState } from 'react'
import EmployeeList from '../employee-list/EmployeeList'
import 'bootstrap/dist/css/bootstrap.min.css'

const ViewEmployeeWithHook = () => {

  const [employees,updateEmployees]=useState([{}])  

  useEffect(()=>fetchDataFromApi(),[])

  const fetchDataFromApi=()=>{
    axios.get("http://localhost:8500/employees")
      .then(response => {
       updateEmployees(response.data)
      })
      .catch((reason) => console.error(reason))
  }

  return (
    <div>
    <table className='table table-dark'>
           <thead>
           <tr>
            <th>Employee ID</th>
            <th>Employee Name</th>
            <th>Email</th>
            <th colSpan={2}>Delete/Update</th>
            </tr>
           </thead>
            <tbody>
             {/* {employees.map(emp=><EmployeeList key={emp.employeeId} employee={emp}/>) */}
             {employees.map(emp=><EmployeeList key={emp.employeeId} employee={emp}/>)}
         </tbody>
     </table>
     
    </div>
  )
}

export default ViewEmployeeWithHook
