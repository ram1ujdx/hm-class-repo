import { Component, OnInit } from '@angular/core';
import { Employee } from '../Employee';
import { EmployeeApiService } from '../employee-api.service';
import { EmployeeStorage } from '../EmployeeStorage';

@Component({
  selector: 'app-view-employee',
  templateUrl: './view-employee.component.html',
  styleUrls: ['./view-employee.component.css']
})
export class ViewEmployeeComponent implements OnInit {

  constructor(public _employeeClient:EmployeeApiService) { }

  employee?:Employee;
  employees:Array<Employee>=[]

  ngOnInit(): void {
   
    this.fetchEmployeesFromServer()
   
  }


  fetchEmployeesFromServer(){
    this._employeeClient.findAllEmployees().subscribe(
      data => this.employees=data,

      error => console.error(error)
    )
  }

  fetchEmployeeForUpdate(employee:Employee){
    console.log(employee)
    this.employee=employee
  }

  deleteEmployee(employeeId:number){
    if(confirm("Sure to delete?")){
      this._employeeClient.deleteEmployee(employeeId).subscribe(
        data => {
        alert("Deleted")
        this.fetchEmployeesFromServer()
        }
      )
      
    }
  }

}
