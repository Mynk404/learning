var arr1=[10,true,"hi",false];


//push
// arr1.push("car","truck",22);
// console.log(arr1);

//pop
// arr1.pop();

//unshift
// arr1.unshift("jagdamba", "bridge", 55);
// console.log(arr1);

//shift
//arr1.shift();

// console.log(arr1);

// let arr2 = arr1.slice(1,3);
// console.log(arr2);


//*SPLICE* effects the original array whereas *SLICE* returns the value and can be stored in a new array
// let arr2 =arr1.slice(1,3)
//  arr1.splice(1,2,"car","truck","public")
//  console.log(arr2);

//  arr1.reverse();
//  console.log(arr1);


// toString() is used to change the contents of an array to string as it is
// let str = arr1.toString();
// console.log(str);


//join is used to change the contents of an array to string but we can decide what will replace the , between the elements of the array
// let str=arr1.join(" ");
// console.log(str);


//includes - it checks whether the passed value is present in the array or not 
//in case there is a sub array present then we need to mention the index of the sub array to search otherwise it will return false
//  arr1.push(["car","bike","truck"]);
//  console.log(arr1);
// let bool = arr1[4].includes("bike");
// console.log(bool);


// indexOf will return the first index number where the element passed is present, if not present it will return -1
// let num = arr1.indexOf("hi");
// console.log(num);


// lastIndexOf will return the last index number where the element passed is present, if not present it will return -1
// arr1.push(true, false);
// console.log(arr1);

// let num= arr1.lastIndexOf(true);
// console.log(num);