class Student{
    id;
    name;
    age;
    address;
    constructor(id,name,age,address='Not Available'){
        this.id=id;
        this.age=age;
        this.name=name;
        this.address=address;
    }
    showStudentInfo(){
        console.log(`Name : ${this.name}`)
        console.log("ID : "+this.id)
        console.log("Age : "+this.age);
        console.log("Address : "+this.address)
    }

}

class EngineeringStudent extends Student{
    branch;
    year;
    constructor(id,name,age,address,branch,year){
        super(id,name,age,address)
        this.branch=branch
        this.year=year
    }

    showStudentInfo(){
        super.showStudentInfo()
        console.log(this.year)
        console.log(this.branch)
    }
}

let student = new EngineeringStudent(1010,'Mahesh',22,'JP Nagar','CSE',2020);

student.showStudentInfo()

