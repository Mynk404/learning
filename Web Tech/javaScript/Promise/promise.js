//to get data from server promise is created by js which has 3 values- pending(default), resolve and reject
console.time("start")
fetch('https://jsonplaceholder.typicode.com/users')
.then((res)=>{
    // console.log(res);
    res.json()
    .then((succ)=>{
        
        console.log(succ);
        console.timeEnd("start")
    })
    .catch((fail)=>{
        console.log(fail);
        
    })
})
.catch((err)=>{
    console.log(err);
})

//here .then() is object created within json and fetch to chech for resolve cases and .catch() is created which is used for reject cases, both take a callback function as argument.  