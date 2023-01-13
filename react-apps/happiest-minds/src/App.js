import React, { Component } from 'react'
import EmployeeList from './employee-list/EmployeeList'
import EmployeeForm from './employee/EmployeeForm'
import Header from './header/Header'
import ViewEmployee from './view-employees/ViewEmployee'
import { Route,Routes } from 'react-router-dom'
import Home from './home/Home'
import ErrorPage from './error-page/ErrorPage'
import Play from './play/Play'
import EmployeeWithHook from './employee/EmployeeWithHook'
import ViewEmployeeWithHook from './view-employees/ViewEmployeeWithHook'

export class App extends Component {
  constructor() {
    super()
    this.addEmployee = this.addEmployee.bind(this)
    this.state = {
      employeeList: []
    }
  }


  render() {
    return (
      <div className='container'>
        <div className='row'>
          <div className='col-12'>
            <Header />
          </div>
          
          <div className='col-12'>
         <Routes>
          <Route path='/' element={<Home/>}/>
            <Route path='/add-employee' element={<EmployeeForm />}/>
            <Route path='/view-employee' element={<ViewEmployee/>}/>
            <Route path='/*' element={<ErrorPage/>}/>
          </Routes>
          </div>
          
          {/* <div className='col-12'>
           <EmployeeWithHook/>
          </div>
          <div className='col-12'>
           <ViewEmployeeWithHook/>
          </div> */}
        </div>
      </div>
    )
  }

  addEmployee(employee) {
    console.log(this.state.id)
    const list = this.state.employeeList;
    list.push(employee)
    this.setState({
      employeeList: list
    })
  }
}

export default App
