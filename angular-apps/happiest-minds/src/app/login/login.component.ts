import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LoginService } from '../login.service';
import { UserCredentials } from '../UserCredentials';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private _router:Router, private _loginService:LoginService) { }

  userCreds={
    username:'admin',
    password:'admin123'
  }

  ngOnInit(): void {
  }

  login(user:UserCredentials){
    // if(user.username===this.userCreds.username && user.password===this.userCreds.password){
    //   sessionStorage.setItem("user",user.username)
    //   this._router.navigate(["/"])
    // }
    this._loginService.authenticate(user).subscribe(
      data => sessionStorage.setItem("hm.auth",data.value)
    )


  }

}
