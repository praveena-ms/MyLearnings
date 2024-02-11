//1. var: old way. 
//scope: functional / local + global

var x = 10;
function test() {
    var y = 20;
}
console.log(x);

var pop = "Hi";
function rel() {
    var top = "Hello";
}
rel();
// console.log(top); //  specific 

var browser = "chrome";
var browser = "firefox"; // redeclaration is allowed with var. But not with let
browser = "edge";
console.log(browser);

var g; //declare but no assignment
console.log(g); // default value is 'undeclared'

// Issue with var in JS: 
var flag = "Praveena";
var t1 = 4;
if(t1 > 3) {
   var flag = "Veena";
}
console.log(flag); // your flag variable is redeclared 
// This is the main reason of not using var


// ------------------------------------------------------------------------------------------------

//let:
//scope: block scoped: {}
let m = "praveena";
let time = 4;
if(time > 3) {
    let msg = "veena";
    console.log(msg);
}
//console.log(msg); // throws error as msg is not defined

//const: to declare constant values
const mg = "praveena";
//mg = "hi"; // throws error saying cannot be reassigned
console.log(mg);
const days = 7;
//days = 10 // It prevents this actions throwing error
console.log(100 * days);



