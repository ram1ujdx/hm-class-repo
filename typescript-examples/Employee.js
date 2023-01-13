var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Employee = /** @class */ (function () {
    function Employee(employeeId, employeeName, email) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.email = email;
    }
    return Employee;
}());
var FullTimeEmployee = /** @class */ (function (_super) {
    __extends(FullTimeEmployee, _super);
    function FullTimeEmployee(employeeId, employeeName, email) {
        var _this = _super.call(this, employeeId, employeeName, email) || this;
        _this.employeeId = employeeId;
        _this.employeeName = employeeName;
        _this.email = email;
        return _this;
    }
    FullTimeEmployee.prototype.showEmployee = function () {
        console.log("Details of fulltime employee : ");
        console.log(this);
    };
    return FullTimeEmployee;
}(Employee));
var ContractEmployee = /** @class */ (function (_super) {
    __extends(ContractEmployee, _super);
    function ContractEmployee(employeeId, employeeName, email) {
        var _this = _super.call(this, employeeId, employeeName, email) || this;
        _this.employeeId = employeeId;
        _this.employeeName = employeeName;
        _this.email = email;
        return _this;
    }
    ContractEmployee.prototype.showEmployee = function () {
        console.log("Details of contract employee : ");
        console.log(this);
    };
    return ContractEmployee;
}(Employee));
var emp1 = new ContractEmployee(1006, 'Harsh', 'harsh@yahoo.com');
var emp2 = new FullTimeEmployee(2005, 'Umesh', 'umesh@gmail.com');
emp1.showEmployee();
emp2.showEmployee();
//let emp1:Emplyee = new Emplyee(1001,'Harsh','harsh@yahoo.com')
// let emp2:Emplyee = {
//     employeeName:'Rahul',
//     employeeId:1002,
//     email:'rahul@yahoo.com',
//     showEmployee(){
//         console.log("Employee ID : "+this.employeeId)
//         console.log("Employee Name : "+this.employeeName)
//         console.log("Email : "+this.email)
//     }
// }
