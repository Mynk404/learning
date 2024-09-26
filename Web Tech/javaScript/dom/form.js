function login(){
    let uname=document.getElementById("uname").value;
    let pword=document.getElementById("pword").value;
    

    if (uname =="mynk" && pword=="mynk") {
        alert("login completed");
    }
    else{
        alert("wrong credentials")
    }
}

function show(){
    let pword=document.getElementById("pword");
    if(pword.type=="password"){
        pword.type="text"
    } 
    else{
        pword.type="password"
    }
}