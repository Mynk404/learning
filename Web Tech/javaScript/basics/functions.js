function first(){
    console.error("welcome to javascript");
    
}
first();
function add(a,b){
    let total=a+b;
    console.log(total);
    
}
add(33,51);

function sum(a,b,c){
    let sum=a+b+c;
    return sum;
    console.log("anything written after return statement will not be reachable");
    
}
let a1=sum(10,10,12);
console.log("the sum of three numbers is: "+a1);
