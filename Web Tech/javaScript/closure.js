let a=10;
let b=20;
function parent(){
    let c=5;
    console.log(a+b+c);
    function child(){   1``
        let d=15;
        console.log(a+b+c+d);
    }
    child();
}
parent();

//the elements which are local to the function cannot be called outside that means that child() cannot be called outside parent() and hence the variable 'd' will not have the same meaning outside child() function