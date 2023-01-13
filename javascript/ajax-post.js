let XMLHttpRequest = require('xhr2');

let person = {
    personName:"Javed",
    age:32,
    city:"Chennai"
}

function getGitInfo() {
    let xhr = new XMLHttpRequest();
    xhr.open("POST", "http://localhost:3000/persons", true);
    xhr.setRequestHeader("Content-Type", "application/json");
    xhr.onload = function () {
        let user = JSON.parse(this.response)
        console.log(user)
    }

    xhr.send(JSON.stringify(person));
}

getGitInfo()