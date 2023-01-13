var UserType;
(function (UserType) {
    UserType[UserType["ADMIN"] = 10] = "ADMIN";
    UserType[UserType["USER"] = 20] = "USER";
    UserType[UserType["MAINTAINER"] = 30] = "MAINTAINER";
})(UserType || (UserType = {}));
var user = {
    username: 'Karan',
    userType: UserType.MAINTAINER
};
var userType = UserType.MAINTAINER;
console.log(userType);
