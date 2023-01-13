var student1 = {
    studentId: 1001,
    studentName: 'Javed',
    city: 'Bangalore',
    printStudentDetails: function () {
        console.log(this);
    }
};
var student2 = {
    studentId: 1002,
    studentName: 'Javed',
    city: 'Delhi',
    printStudentDetails: function () {
        console.log(this);
    }
};
console.log(student1);
console.log(student2);
