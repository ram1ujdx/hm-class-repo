import React, { Component, PureComponent } from 'react'
import 'bootstrap/dist/css/bootstrap.min.css'
import axios from 'axios'
import { Navigate } from "react-router-dom";


export class EmployeeForm extends Component {

    constructor(props) {
      super(props)
   // this.handleFromInputs=this.handleFromInputs.bind(this)
     // const {employeeId,employeeName,email}=this.props.emp;
      this.state = {
         employeeId:'',
         employeeName:'',
         email:'',
         joinDate:'',
         emailValid:false,
         employeeIdValid:false,
         employeeNameValid:false,
         formValid:false,
         employee:{},
         success:false
      }
    }
    
    componentDidMount(){
      if(this.props.emp){
      const {employeeId,employeeName,email,joinDate}=this.props.emp;
        this.setState({
          employeeId:employeeId,
          employeeName:employeeName,
          email:email,
          joinDate:joinDate,
          emailValid:true,
         employeeIdValid:true,
         employeeNameValid:true,
         formValid:true,

        }
        )
      }
      
    }

    

  render() {

    const employeeIdError = !this.state.employeeIdValid && 
                            <p className='text-danger'>Input a valid Employee ID</p>
    
    // if(this.state.success){
    //   return <Navigate to="/view-employee"/>
    // }
    // else
    return (
      <div>
        <h2>Employee Information</h2>
        <form method='post' onSubmit={(event)=>this.saveEmployeeData(event)}>
           <div className='form-group'>
            <label className='form-label' htmlFor='employeeId'>Employee ID</label>
            <input type='text' 
                name='employeeId' 
                className='form-control' 
                value={this.state.employeeId}
                placeholder='Input Employee ID'
                required
                onChange={(event)=>this.handleFromInputs(event)}
                />
                {employeeIdError}
           </div> 

           <div className='form-group'>
            <label className='form-label' htmlFor='employeeName'>Employee Name</label>
            <input type='text' 
                name='employeeName' 
                className='form-control' 
                value={this.state.employeeName}
                placeholder='Input Employee Name'
                onChange={(event)=>this.handleFromInputs(event)}
                />
           </div> 

           <div className='form-group'>
            <label className='form-label' htmlFor='email'>Email</label>
            <input type='email' 
                name='email' 
                className='form-control' 
                value={this.state.email}
                placeholder='Input Email'
                onChange={(event)=>this.handleFromInputs(event)}
                />
           </div> 

           <div className='form-group'>
            <label className='form-label' htmlFor='joinDate'>Date Joined</label>
            <input type='date' 
                name='joinDate' 
                className='form-control' 
                value={this.state.joinDate}
                placeholder='Input Date Joined'
                onChange={(event)=>this.handleFromInputs(event)}
                />
           </div> 

            <button type='submit' disabled={!this.state.formValid} className='btn btn-primary'>Save Employee</button>

        </form>

      </div>
    )
  }


  handleFromInputs(event){
    const inputName = event.target.name;
    const value = event.target.value;

    this.setState({
        [inputName]:value
    },()=>this.validateInputs(inputName,value))
  }

  validateInputs(input,value){
    let isValid=false;
    switch(input){
        case 'employeeId':
            isValid=value.length>=5 && value.length<=8
            this.setState({
                employeeIdValid:isValid
            })
            break;
        case 'employeeName':
            isValid=value.length>=3
            this.setState({
                employeeNameValid:isValid
            })
            break;
        case 'email':
            isValid=value.length>=8
            this.setState({
                emailValid:isValid
            })
            break;
    }
    this.setState({},()=>this.validateForm())
  }

  validateForm(){
    const formValid = this.state.employeeIdValid && this.state.employeeNameValid && this.state.emailValid;
    this.setState({
        formValid:formValid
    })
  }

  saveEmployeeData(event){
    event.preventDefault();
    const employee = {
      id:this.state.employeeId,
      employeeId:this.state.employeeId,
      employeeName:this.state.employeeName,
      email:this.state.email,
      joinDate:this.state.joinDate
    }
    if(this.props.emp){
      axios.put("http://localhost:8500/employees",employee)
      .then(response=>{
        this.setState({
        employee:response.data,
        success:true
      })
      alert("Employee Updated Successfully")
      this.props.fetchDataFromApi();
    })
      .catch(err=>console.error(err))
      
//this.props.addEmployee(this.state)
}
    else{
    axios.post("http://localhost:8500/employees",employee)
          .then(response=>{
            this.setState({
            employee:response.data,
            success:true
          })
          alert("Employee Added Successfully")
          
        })
          .catch(err=>console.error(err))
          
    //this.props.addEmployee(this.state)
  }
}

}

export default EmployeeForm
