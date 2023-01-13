var user = {
    uname: 'Karan',
    email: 'karan@yahoo.com',
    country: 'India',
    showUser: function () {
        console.log('Hello User');
    }
};
var uname = user.uname, country = user.country, showUser = user.showUser;
console.log(uname);
console.log(country);
showUser();
