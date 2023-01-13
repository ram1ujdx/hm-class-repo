let user = {
    uname:'Karan',
    email:'karan@yahoo.com',
    country:'India',
    showUser(){
        console.log('Hello User')
    }
}


const {uname,country,showUser} = user;

console.log(uname)
console.log(country)

showUser()