let today = new Date('2022-11-05');
//console.log(today.getDay())
async function sayHello(){
    console.log("Hello World")
    if(today.getDay()>=6){
        return Promise.resolve("Happy Weekend")
    }
    else{
        return Promise.reject("You have to work")
    }
}


let promise =new Promise( (resolve,reject)=>{
    setTimeout(()=>resolve("Promise resolved succesfully"),5000)
}
)

async function greet(){
   let output = await promise;
    console.log(output)
    console.log("JS is Fun")
}

greet()

// sayHello().then((msg)=>console.log(msg))
//             .catch(msg=>console.log(msg))