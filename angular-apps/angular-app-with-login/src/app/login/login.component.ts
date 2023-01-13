import { Component, OnInit } from '@angular/core';
import { LoginService } from '../login.service';
import { UserCredentials } from '../user-credentials';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private _loginService:LoginService) { }

  ngOnInit(): void {
  }

  public login(user:UserCredentials){
    this._loginService.authenticate(user).subscribe(
      response => sessionStorage.setItem("hm.auth",response.value)
    )
  }

}
