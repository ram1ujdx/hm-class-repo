import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-greet',
  templateUrl: './greet.component.html',
  styleUrls: ['./greet.component.css']
})
export class GreetComponent implements OnInit {


  @Input("msg")
  msg:String='';

  constructor() { }

  ngOnInit(): void {
  }

}
