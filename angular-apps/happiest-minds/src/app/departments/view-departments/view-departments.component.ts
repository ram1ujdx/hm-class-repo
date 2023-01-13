import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-view-departments',
  templateUrl: './view-departments.component.html',
  styleUrls: ['./view-departments.component.css']
})
export class ViewDepartmentsComponent implements OnInit {

  constructor() { 
    console.log("Department Component Loaded")
  }

  ngOnInit(): void {
  }

}
