import axios from 'axios'

import React, { useEffect, useState } from 'react'

const EmployeeWithHook = () => {
    const [employee,updateEmployee] = useState({id:'',employeeId:'',employeeName:'',email:''});
    const [employeeVaild, validateEmployee]=useState({employeeIdValid:false,
                                                     employeeNameValid:false,
                                                     emailValid:false,
                                                     formValid:false});
    

    useEffect(()=>{
       validateForm()},[employee]);


    const saveEmployee = (employee)=>{
        employee.id=employee.employeeId
        axios.post("http://localhost:8500/employees",employee)
                .then(e=>console.log(e.data))
                .catch(e=>console.log(e))
    }

   const handleFromInputs= (event) => {
        const inputName = event.target.name;
        const value = event.target.value;
        updateEmployee({...employee,[inputName]:value})
        
      }
    const validateForm = ()=>{
        console.log("Validate Form Called")
        const employeeIdisValid = employee.employeeId.length>=5 && employee.employeeId.length<=8
        const employeeNameIsValid = employee.employeeName.length>=3
        const emailIsValid = employee.email.length>=8
        const isFormValid = employeeIdisValid && employeeNameIsValid && emailIsValid
        validateEmployee({employeeIdValid:employeeIdisValid, employeeNameValid:employeeNameIsValid, emailValid:emailIsValid,formValid:isFormValid})
        console.log(employeeVaild)
      
      }

  return (
    <div>
    <label>Employee ID</label>
    <input type={'text'} name='employeeId' value={employee.employeeId} 
                                    onChange={(e)=>handleFromInputs(e)}/>
    <label>Employee Name</label>
    <input type={'text'} name='employeeName' value={employee.employeeName} 
                                    onChange={(e)=>handleFromInputs(e)}/>
    <label>Email</label>
    <input type={'email'} name='email' value={employee.email} 
                                    onChange={(e)=>handleFromInputs(e)}/>
      <h1>{JSON.stringify(employee)}</h1>

<button disabled={!(employeeVaild.formValid)} onClick={()=>saveEmployee(employee)}>Add Employee</button>

    </div>
    
  )
}

export default EmployeeWithHook


