//for loop
for(let i=1; i<=10; i ++) {
    console.log(i);
}

//for...of loop:
const array = [1,2,3,4,5,6,7,8,9,10];
for(const e of array) {
    console.log(e);
}

//while
let p = 1;
while(p <= 10) {
    console.log(p);
    p ++;
}

//do-while
let h = 1;
do {
    console.log(h);
    h ++;
}
while(h <= 10);

//break;
let num = 0
while(num<= 100) {
    console.log(num);
    if(num % 5 == 0) {
        console.log("Hi");
        break;
    }
    num ++;
}

//for...in loop on object:
const user = {
    name: "Praveena",
    city: "Long Beach",
    state: 'CA'
}
for(const key in user) {
    console.log(key + " : " + user[key]); // prints the entire object keys and values of each key
}

const br = [""]
