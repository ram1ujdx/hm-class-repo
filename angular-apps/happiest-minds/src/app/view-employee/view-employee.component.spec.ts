import { HttpClient } from "@angular/common/http";
import { Observable, from, observable } from "rxjs";
import { Employee } from "../Employee";
import { EmployeeApiService } from "../employee-api.service"
import { ViewEmployeeComponent } from "./view-employee.component";

describe('View-Employee', () => {

  let http: any;
  let employeeClientService: EmployeeApiService = new EmployeeApiService(http)
  let viewEmployeeComponent = new ViewEmployeeComponent(employeeClientService)

  it('it should fetch employees from api when fetchEmployeesFromServer() is called', () => {

    // when employeeClientService.findAllEmployees() is called return some employees
    spyOn(employeeClientService, 'findAllEmployees').and.callFake(() => {

      return from([
        [new Employee(1001, 'Harsh', 'harsh@yahoo.com', new Date('2020-10-10'))]
      ])

    })

    viewEmployeeComponent.fetchEmployeesFromServer()
    expect(viewEmployeeComponent.employees.length).toBeGreaterThan(0)
  })

})