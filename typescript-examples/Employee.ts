abstract class Employee{

    constructor(public employeeId:number, public employeeName:string, public email:string){   
    }

    public abstract showEmployee();
    

}

class FullTimeEmployee extends Employee{

    constructor(public employeeId:number, public employeeName:string, public email:string){
        super(employeeId,employeeName,email)
    }

    public showEmployee() {
        console.log("Details of fulltime employee : ")
        console.log(this)
    }
}

class ContractEmployee extends Employee{

    constructor(public employeeId:number, public employeeName:string, public email:string){
        super(employeeId,employeeName,email)
    }

    public showEmployee() {
        console.log("Details of contract employee : ")
        console.log(this)
    }
}

let emp1:Employee = new ContractEmployee(1006,'Harsh','harsh@yahoo.com');

let emp2= new FullTimeEmployee(2005,'Umesh','umesh@gmail.com')

emp1.showEmployee()

emp2.showEmployee()




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
