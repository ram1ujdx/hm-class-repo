import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { JwtToken } from './jwt-token';
import { UserCredentials } from './user-credentials';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  baseUrl = "http://localhost:8888"
  constructor(private _authClient:HttpClient) { }

  authenticate(credentails:UserCredentials):Observable<JwtToken>{
    return this._authClient.post<JwtToken>(this.baseUrl+"/auth/public/login",credentails);
  }

}
