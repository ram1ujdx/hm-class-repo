import { Component, OnInit } from '@angular/core';
import { Data } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent  {
  
  today=new Date().getDay();
  message:string='Good Morning'
  username:string=''

  btnDisabled=false;

  saySomething(username:any){
    this.username=username
  }


  
}
