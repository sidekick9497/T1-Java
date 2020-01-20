// constructor function

// function expression
// creating a class named Student
// prototype : middle of functions and classes
// defining a class through a constructor
/*var Student = function(name, age, gpa){
    // this : window object (default)
    // this : represent object(custom)
    this.name = name;
    this.age = age;
    this.gpa = gpa;
};

Student.prototype.grade = 5;

Student.prototype.calcAge = function(year){
    return 2020 - year;
}

var stud1 = new Student("First", 20, 3.5);
var stud2 = new Student("Second", 25, 3.7);

console.log(stud1.name);
console.log(stud2.calcAge(2000));
console.log(stud1.grade);
console.log(stud2.grade);
stud2.grade = 2;
console.log(stud1.grade);
console.log(stud2.grade);

*/

// object named Employee of anonymous class
/*var Employee = {
    name : "First",
    age : 20,
    calcAge : function(){
        console.log("Calc Age");
    }
};

Employee.calcAge();

var emp1 = Object.create(Employee);
emp1.calcAge();
*/

// IIFE : Implicitly Invoking Function expression

/*function calcAge(year){
    return 2020 - year;
}

var age = calcAge(2000);
console.log(age);
*/
/*
var age = (function(year){
    return 2020 - year;
})(2000);

console.log(age);
*/


// Closures

// IIFE outer : returning inner
// incr : reference to a function (inner function)
var incr = (function(){ // outer
    var counter = 0;

    return function(){ // will be assigned to incr
        counter++;
        return counter;
    }
})();


console.log(incr());
console.log(incr());
console.log(incr());
console.log(incr());
console.log(incr());













