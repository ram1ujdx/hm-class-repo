import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Employee } from '../Employee';
import { EmployeeApiService } from '../employee-api.service';

@Component({
  selector: 'app-show-employee',
  templateUrl: './show-employee.component.html',
  styleUrls: ['./show-employee.component.css']
})
export class ShowEmployeeComponent implements OnInit {

  constructor(private _route:ActivatedRoute, private employeeClient:EmployeeApiService) { }
  employee?:Employee;
  ngOnInit(): void {
    this._route.params.subscribe(param=>{
      const id=param['id']
      this.employeeClient.findEmployeeById(id).subscribe(
        (data)=>this.employee=data
      )
    })
  }

}
