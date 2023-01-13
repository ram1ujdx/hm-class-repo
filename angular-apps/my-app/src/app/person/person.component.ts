import { Component, OnInit } from '@angular/core';
import { Person } from '../Person';

@Component({
  selector: 'app-person',
  templateUrl: './person.component.html',
  styleUrls: ['./person.component.css']
})
export class PersonComponent implements OnInit {


  person?:Person;
  errorMsg:string=''
  tableStyle='table'

  personList:Person[]=[
    {
      personName:'Suraj',
      email:'suraj@yahoo.com',
      city:'Bangalore'
    },
    {
      personName:'Manish',
      email:'manish@yahoo.com',
      city:'Mumbai'
    },
    {
      personName:'Rahul',
      email:'rahul@yahoo.com',
      city:'Bangalore'
    },
    {
      personName:'Mohan',
      email:'mohan@yahoo.com',
      city:'Delhi'
    }
  ];

  constructor() { }

  ngOnInit(): void {
  }

  readPerson(personName:any,email:any,city:any){
    this.person=new Person(personName,email,city)
    this.personList.push(this.person)
  }

  searchPerson(personName:any){
    this.person=undefined
    this.errorMsg=''
    this.person=this.personList.find(p=>p.personName.toLowerCase()===personName.toLowerCase())
    if(!this.person){
      this.errorMsg='Person with name '+personName+' Not found'
    }
  }

  chooseBgColor(city:string){
    return city=='Bangalore'?'green':'blue'
  }

  
  
}
