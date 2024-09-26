let cart= [
    {
        id: 101,
        name: "dhaniya powder",
        price: 150,
    },
    {
        id: 102,
        name: "khada jeera",
        price: 100,
    },
    {
        id: 103,
        name: "tej patta",
        price: 70,
    },
    {
        id: 104,
        name: "chicken masala",
        price: 250,
    },
    {
        id: 105,
        name: "kesar",
        price: 1050,
    },
]
//used to iterate through objects in array and return the specified property
let cartObj=cart.map((i)=>{
    return i;
})
console.log(cartObj);

//used to filter the objects in the array based on the property specified 
let fil=cart.filter((i)=>{
    return i.price>500;
})
console.log(fil);


//used to reduce or perform any operation on all the common properties of the objects

let red=cart.reduce((sum,i)=>{
    sum+=i.price  
    return sum
} ,0)
console.log(red);

