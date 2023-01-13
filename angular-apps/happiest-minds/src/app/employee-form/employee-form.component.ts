import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Employee } from '../Employee';
import { EmployeeApiService } from '../employee-api.service';
import { EmployeeStorage } from '../EmployeeStorage';

@Component({
  selector: 'app-employee-form',
  templateUrl: './employee-form.component.html',
  styleUrls: ['./employee-form.component.css']
})
export class EmployeeFormComponent implements OnInit {

  constructor(private _employeeClient:EmployeeApiService, 
                private _router:Router) {
                  console.log("Employee Form Component Loaded")
                 }

  ngOnInit(): void {
  }

  saveEmployee(employee:Employee){
    this._employeeClient.saveEmployee(employee)
                  .subscribe(data=>this._router.navigate(['/view-employee']))
  }

}
