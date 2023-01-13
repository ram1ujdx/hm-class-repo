import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-footer',
  templateUrl: './footer.component.html',
  styleUrls: ['./footer.component.css']
})
export class FooterComponent implements OnInit {

  constructor() { }

  today=new Date()

  ngOnInit(): void {
    setInterval(()=>this.today=new Date(),1000)
  }

}
