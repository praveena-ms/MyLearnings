let empty = [];

//1. Push method to add 1 or more elements to the end of the array
let lang = ["Java", "Python", "JS"];
lang.push("Ruby", "HTML");
console.log(lang);

//2. pop to remove the last element for the array
let numbers = [1,2,3,4,5,6];
numbers.pop();
console.log(numbers);

//3. Shift method: remove first element from the array and returns that element
let fruits = ["apple", "banana", "orange"];
console.log(fruits.shift());
console.log(fruits);

//4. Unshift: adds one or more elements to the beginning of the array and returns number of elements in array
let colors = ['red', 'green'];
console.log(colors.unshift('orange', 'yellow'));
console.log(colors);

//5. Splice(): Add or remove elements from specific index in the array
let animals = ['dog', 'cat', 'panda'];
animals.splice(1,2,'bear'); // remove 2 element from index 1 and add this element in that position
console.log(animals); // 0 based indexing

//6. slice(): 
let pop = [1,2,3,4,5];
let newpop = pop.slice(1,4); // include beginning and exclude last index
console.log(newpop);

//7. concat():
let fr = ["apple", "banana", "orange"];
let num = [1,2,3,4];
let mixedArray = fr.concat(num);
console.log(mixedArray); 

//8. indexOf():
let color = ['green', 'red', 'yellow', 'red'];
console.log(color.indexOf('red')); // return the first occurance of red
console.log(color.indexOf('blue')); // returns -1 if not found
//next occurance
console.log(color.indexOf('red', 2)); // start checking from this index
console.log(color.indexOf('red', color.indexOf('red')+1)); // returns 2nd index


//9. includes()
console.log(colors.includes('green', 'blue')); // returns true if any of those exist. works on OR condition.

//10. foreach():
let n = [1,2,3,4,5];
n.forEach((e)=> {
    console.log(e);
})