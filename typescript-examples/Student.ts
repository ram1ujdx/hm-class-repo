interface Student{
    studentId:number;
    studentName:string;
    city:string;
    printStudentDetails():void;
}

let student1:Student ={
    studentId:1001,
    studentName:'Javed',
    city:'Bangalore',
    printStudentDetails(){
        console.log(this)
    }
}

let student2:Student ={
    studentId:1002,
    studentName:'Javed',
    city:'Delhi',
    printStudentDetails(){
        console.log(this)
    }
}

console.log(student1)
console.log(student2)