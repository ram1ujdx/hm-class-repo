//let XMLHttpRequest = require('xhr2');

function getGitInfo() {
    let xhr = new XMLHttpRequest();
    let username=document.getElementById('username').value;
    xhr.open("GET", "https://api.github.com/users/"+username, true);

    xhr.onload = function () {
        let user = JSON.parse(this.response)
        document.getElementById("uname").innerHTML=user.name;
        document.getElementById("location").innerHTML=user.location;
        document.getElementById("repos").innerHTML=user.public_repos;
        document.getElementById("dp").src=user.avatar_url;
    }

    xhr.send();
}