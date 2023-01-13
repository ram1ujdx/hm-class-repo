import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from './git-api/User';

@Injectable({
  providedIn: 'root'
})
export class GitClientService {

  constructor(private _http:HttpClient) { }
  url="https://api.github.com/users/";

  getGitUserInfo(username:string):Observable<User>{
    return this._http.get(this.url+username)
  }

  
}
