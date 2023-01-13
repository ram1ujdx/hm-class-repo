import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import { Employee } from './Employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeApiService {

  base_url="http://localhost:8500/employees"

  constructor(public _http:HttpClient) { }

  findAllEmployees():Observable<Array<Employee>>{
    return this._http.get<Array<Employee>>(this.base_url)
  }

  findEmployeeById(id:number):Observable<Employee>{
    return this._http.get<Employee>(this.base_url+"/"+id)
  }

  saveEmployee(employee:Employee):Observable<Employee>{
    return this._http.post<Employee>(this.base_url, employee)
  }

  updateEmployee(employee:Employee):Observable<Employee>{
    return this._http.put<Employee>(this.base_url, employee)
  }
  deleteEmployee(id:number):Observable<any>{
    return this._http.delete(this.base_url+"/"+id)
  }

}
