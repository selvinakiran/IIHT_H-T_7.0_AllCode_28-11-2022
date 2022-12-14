import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-userform',
  templateUrl: './userform.component.html',
  styleUrls: ['./userform.component.css']
})
export class UserformComponent implements OnInit {

  title: String = 'Please fill the form below';

  firstname: String = '';
  lastname: String = '';
  age =0;
  gender: String = ''; 
  email: String = '';

  save(){
    console.log('hello ' +this.firstname+ '' +this.lastname);
    console.log('your email id is ' +this.email);
    console.log('your age is ' +this.age);
    
  }


  constructor() { }

  ngOnInit(): void {
  }

}
