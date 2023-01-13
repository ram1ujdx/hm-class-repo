let XMLHttpRequest = require('xhr2');


async function getGitInfo() {
    return new Promise(
        (resolve,reject)=>{
            let xhr = new XMLHttpRequest();
            let username='ram1ujdxrweyteytfe'
            //let username=document.getElementById('username').value;
            xhr.open("GET", "https://api.github.com/users/"+username, true);

            xhr.onload = function(){
                    if(this.status==200){
                        resolve(xhr.response)
                    }
                    else{
                        reject({
                            "status":404,
                            "message":"Not Found"
                        })
                    }
                }
            xhr.send()
            

    }
)
}

getGitInfo().then(response=>console.log(response))
                .catch(response=>console.log(response))