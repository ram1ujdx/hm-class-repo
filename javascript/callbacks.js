function sayHello(username){
    console.log('Hello '+username);
}

function greet(username,callback){
    callback(username)
}

setTimeout(sayHello,5000)
greet('Rahul',somevalue=>{
    console.log(somevalue)
})