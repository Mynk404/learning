//============================================================STRINGS============================================================================= 


let str="RAMU KAKA";

//let length=str.length;
//console.log(length);


 let index= str.indexOf("a",7);
 console.log(index);

// str=str.toLowerCase();
// console.log(str);

// let index=str.lastIndexOf("a");
// console.log(index);

// let caps=str.toUpperCase();
// console.log(caps);


//--------------instead of 'substring()' used in java we use 'slice()' in JS similar to array inbuilt mehtods-----------------

// let sub = str.slice(0,4);
// console.log(sub);

//---------------in array we can change the array to a string using 'toString()' method, whereas in strings we can change it to array using 'split()' method -----------------------

// let arr= str.split(" ");
// console.log(arr);

//-------------------------------------to replace a char we use the method 'replace("char","char")' and to replace every character in the string we use 'replaceAll("char", "char")------------------------

// str=str.replace("A","6");
// console.log(str);
// str=str.replaceAll("A","0");
// console.log(str);

//----------------------------------String template literals--> it is used to write variables dynamicallt without using concatenation. This is done with the help of ` ` (backticks), the variable needs to be inside {} with $ as prefix. This is how the request in URLs is sent to server side 

// let a=2001;
// console.log(`javascript ${a} template strings`);

// let name= 'bhanu pratap singh';
// console.log(name.replace('pratap','chutiya'));
