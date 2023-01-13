enum UserType{
    ADMIN=10,USER=20,MAINTAINER=30
}


let user={
    username:'Karan',
    userType:UserType.MAINTAINER
}

let userType:UserType = UserType.MAINTAINER

console.log(userType)