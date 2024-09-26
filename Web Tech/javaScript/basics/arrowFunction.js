//===================================================ARROW FUNCTIONS=======================================================

//Instead of function keyword an arrow(=>) is used to indicate that a function is being created.

// add=(a,b) => {
//     console.log("arrow function");
//     return a+b;
// }

// console.log(add(10,12));


//================================================CALLBACK FUNCTION========================================================

//A function which is passed as an argument of another function is known as 'callback' function

add=(a,b) => {
    return a+b;
}

mul=(a,b) => {
    return a*b;
}

total=(calc,a,b)=>{
    return calc(a,b);
}

console.log("press 1 or 2");
let opt=1;
if(opt==1){
    console.log(total(add,20,20));
    
}
else{
    console.log(total(mul,20,20));
    
}





