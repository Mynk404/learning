var op="";
function add(){
    op="add";
}
function sub(){
    op="sub";
}
function mul(){
    op="mul";
}
function div(){
    op="div";
}

function calc(){
    let a=document.getElementById("input1").value
    let b=document.getElementById("input2").value
    let element=document.getElementById("answer")
    if(op=="add"){
        element.innerHTML=parseFloat(a)+parseFloat(b);
    }
    else if(op=="sub"){
        element.innerHTML=parseFloat(a)-parseFloat(b);
    }
    else if(op=="mul"){
        element.innerHTML=parseFloat(a)*parseFloat(b);
    }
    else if(op=="div"){
        element.innerHTML=parseFloat(a)/parseFloat(b);
    }

}
