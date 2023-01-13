//Syntax

// let promise = (resolve,reject)=>{
//     ...
// }

flag = false;

let promise = new Promise(
    (resolve,reject)=>{
        if(flag){
            resolve("Hello we are good to go")
        }else{
            reject("Sorry, we can't proceed")
        }
    }
)

promise.then((resolve)=>console.log(resolve))
            .then(()=>console.log("Another Task"))
            .catch((err)=>console.log(err))
            .finally(()=>console.log("Promise Execution Done"))