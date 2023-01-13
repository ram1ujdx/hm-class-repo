import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, retry } from 'rxjs';
import { JwtToken } from './JwtToken';
import { UserCredentials } from './UserCredentials';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private _authClient:HttpClient) { }

  authenticate(creds:UserCredentials):Observable<JwtToken>{
    return this._authClient.post<JwtToken>("http://localhost:8888/auth/public/login",creds);
  }



}
