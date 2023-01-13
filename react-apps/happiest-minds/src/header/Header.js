import React from 'react'
import 'bootstrap/dist/css/bootstrap.min.css'
import './style.css'
import { Link, NavLink } from 'react-router-dom'

const Header = () => {
  return (
    <div className='header'>
      <h1>Happiest Minds</h1>
      <ul className="nav nav-pills">
        <li className="nav-item">
          <NavLink activeClassName='nav-link active' className="nav-link" to="">Home</NavLink>
        </li>
        <li className="nav-item">
          <NavLink activeClassName='nav-link active' className="nav-link" to="add-employee">Add Employee</NavLink>
        </li>
        <li className="nav-item">
          <NavLink activeClassName='nav-link active' className="nav-link" to="view-employee">View Employee</NavLink>
        </li>
      </ul>

    </div>
  )
}

export default Header
