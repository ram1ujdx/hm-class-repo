import { Component, Input, OnInit } from '@angular/core';
import { Employee } from '../Employee';
import { EmployeeApiService } from '../employee-api.service';
import { EmployeeStorage } from '../EmployeeStorage';

@Component({
  selector: 'app-update-employee',
  templateUrl: './update-employee.component.html',
  styleUrls: ['./update-employee.component.css']
})
export class UpdateEmployeeComponent implements OnInit {

  constructor(private _employeeClient:EmployeeApiService) { }

  @Input("employee")
  employee?:Employee;

  ngOnInit(): void {
  }

  updateEmployee(employee:Employee){
    this._employeeClient.updateEmployee(employee).subscribe(
      data=>console.log(data),
      error => console.error(error)
    )
  }

}
