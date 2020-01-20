/*
// hoisting
var age = calculateAge(2000);
console.log(age);

function calculateAge(year){
    return 2020-year;
}

//var age = calculateAge(2000);
//console.log(age);

// var age = calc_age(2000);
// console.log(age);

// function expression
var calc_age = function(year){
    return 2020 - year;
}

var age = calc_age(2000);
console.log(age);

*/

// Scoping

var g = "Hi";
//console.log(g);

first();

function first(){
    // console.log(g); // undefined : only one scope is active
    var g = "Hello";
    console.log("First : " + g);
    second();

    // nested function
    function second(){
        var l = "Bye";
        console.log("Second : " + g + l); // second is in scope of first
        third();
    }
}

function third(){
    var o = "Available";
    console.log("Third : " + g);
    // console.log(l); // third does not comes in scope of second
    console.log("Third : " + o);
}

//console.log(g);