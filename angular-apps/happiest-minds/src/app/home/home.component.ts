import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private _http:HttpClient) { }

  message:any='No Message Available'

  baseUrl = "http://localhost:8888/auth"

  ngOnInit(): void {
  }

  checkUser(){
    this._http.get(this.baseUrl+"/user").subscribe(
      response => this.message=response,
      error => this.message=error.message
    )
  }

  checkPublic(){
    this._http.get(this.baseUrl+"/public").subscribe(
      response => this.message=response,
      error => this.message=error.message
    )
  }

  checkAdmin(){

    this._http.get(this.baseUrl+"/admin").subscribe(
      response => this.message=response,
      error => this.message=error.message
    )
  }

}
