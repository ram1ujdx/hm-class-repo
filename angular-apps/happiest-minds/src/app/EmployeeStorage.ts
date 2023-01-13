import { Injectable } from "@angular/core";
import { Employee } from "./Employee";
@Injectable({
    providedIn:'root'
})
export class EmployeeStorage{
    employeeList:Array<Employee>=[
       
      ]


      addEmployee(employee:Employee){
        this.employeeList.push(employee)
      }

      deleteEmployee(employeeId:number){
        const index = this.employeeList.findIndex(e=>e.employeeId===employeeId)
        if(index!=-1){
          this.employeeList.splice(index,1)
        }
      }

      updateEmployee(employee:Employee){
        let emp = this.employeeList.find(e=>e.employeeId===employee.employeeId);
        if(emp){
          emp.employeeName=employee.employeeName;
          emp.email=employee.email
        }
      }

    }