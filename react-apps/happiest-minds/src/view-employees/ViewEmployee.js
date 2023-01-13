import React, { Component} from 'react'
import 'axios';
import axios from 'axios';
import 'bootstrap/dist/css/bootstrap.min.css'
import EmployeeList from '../employee-list/EmployeeList';
import EmployeeForm from '../employee/EmployeeForm';

export class ViewEmployee extends Component {

  constructor(props) {
    super(props)
    this.fetchDataFromApi=this.fetchDataFromApi.bind(this)
    this.setEmployee=this.setEmployee.bind(this)
    this.state = {
      employees: [],
      emp:null
    }
  }

  componentDidMount() {
    this.fetchDataFromApi()
  }

 

  fetchDataFromApi(){
    axios.get("http://localhost:8500/employees")
      .then(employees => {
        
        this.setState({
          employees: employees.data
        })
        console.log(employees.data)
      })
      .catch((reason) => console.error(reason))
  }

  render() {
    const emp = this.state.emp;
    const empForm = this.state.emp && <EmployeeForm key={emp.employeeId} emp={emp} fetchDataFromApi={this.fetchDataFromApi}/>
    return (
      <div>
      <h2>List of Employees</h2>
        <table className='table table-dark'>
           <thead>
           <tr>
            <th>Employee ID</th>
            <th>Employee Name</th>
            <th>Email</th>
            <th>Date Joined</th>
            <th colSpan={2}>Delete/Update</th>
            </tr>
           </thead>
           <tbody>
            {this.state.employees.map(emp=><EmployeeList key={emp.employeeId} employee={emp} setEmployee={this.setEmployee}/>)}
            </tbody>
          </table> 
        {empForm}
      </div>
    )
  }

  setEmployee(employee){
    this.setState(
      {
        emp:employee
      }
    )
  }

}

export default ViewEmployee
