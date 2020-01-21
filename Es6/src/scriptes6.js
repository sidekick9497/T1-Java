// let and const
/*
let a = 10;
// must to initialize
// once a value assigned, cannot be changed
const b = 20;

// b=30;

function es5Check(year){

	if(year > 20){
		var name = "First";
		var grade = 5;
	}

	var x = 10;
	var x = 20;
	console.log(x);
	console.log(name);
	console.log(grade);
}

es5Check(25);

function es6Check(year){
	
	if(year > 20){
		let name = "First";
		let grade = 5;
	}
	//let x = 10;
	//let x = 20;
	console.log(x);
	console.log(name);
	console.log(grade);
}

es6Check(25);

*/
/*
// substitution
let name = "First";
let age = 20;
console.log(name + " is of age : " + age); // ES5 way

console.log(`${name} is of age : ${age}`); // ES6 way : substitution
*/
/*
//Arrays
let names = ["First","Second","Third"];
// names.forEach(<function>);
names.forEach(function(name){
	console.log(name.length);
});

// names.map(<function>);
let yob = [1998, 2000, 1996, 2001];
let ages = yob.map(function(year){
	return 2020-year;
});

console.log(ages);
*/
/*
// Destructuring
let yob = [1998, 2000, 1996, 2001];
// var a = yob[0];
let [a,b,c,d] = yob;

console.log(a);
console.log(b);
console.log(c);
console.log(d);

var obj = {
	name : "First",
	age : 20
};
let [x,y] = obj;
console.log(x);
console.log(y);
*/

let yob1 = [1998, 2000, 1996, 2001];
let yob2 = [1991, 1990, 1988, 1985];
let yob = [...yob1,1980,...yob2];
console.log(yob);




