import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators,FormBuilder } from '@angular/forms';
import { Employee } from '../Employee';
import { ForbiddenKeywordsValidator } from '../ForbiddenKeywordsValidator';


@Component({
  selector: 'app-employee-form-reactive',
  templateUrl: './employee-form-reactive.component.html',
  styleUrls: ['./employee-form-reactive.component.css']
})
export class EmployeeFormReactiveComponent implements OnInit {

  constructor(private _formBuilder:FormBuilder, private http:HttpClient) { }

  employeeForm:any

  // employeeForm = new FormGroup(
  //  {
  //   employeeName:new FormControl('',[Validators.required]),
  //   employeeId:new FormControl(''),
  //   email:new FormControl('')
  //  }
  // )

  ngOnInit(): void {
    // this.http.get("https://api.github.com/users/ram1ujdx").subscribe(
    //   data => console.log(data)
    // )
    this.employeeForm=this._formBuilder.group(
      {
        employeeId:['',[Validators.required],[new ForbiddenKeywordsValidator(this.http).validate]],
        employeeName:['',[Validators.required,Validators.pattern('[a-zA-Z\\s]+')]],
        email:['',[Validators.required,Validators.email]],
        address:this._formBuilder.group(
          {
            area:[''],
            city:[''],
            zipCode:['']
          }
        )
      }
    )
  }

  saveEmployee(employee:any){
    console.log(employee)
  }

}
