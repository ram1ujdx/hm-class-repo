import { Component, OnInit } from '@angular/core';
import { GitClientService } from '../git-client.service';
import { User } from './User';

@Component({
  selector: 'app-git-api',
  templateUrl: './git-api.component.html',
  styleUrls: ['./git-api.component.css']
})
export class GitApiComponent implements OnInit {

  constructor(public _gitClient:GitClientService) { }

  ngOnInit(): void {
  }

  user?:User;

  fetchGitUserInfo(username:string){
    this._gitClient.getGitUserInfo(username).subscribe(
      response => this.user=response
    )
  }

}
