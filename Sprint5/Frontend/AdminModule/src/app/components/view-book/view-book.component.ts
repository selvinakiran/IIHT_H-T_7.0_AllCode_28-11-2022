import { Component, OnInit, ViewEncapsulation } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import User from 'src/app/models/user';
import { UserService } from 'src/app/services/user.service';

import { Pipe, PipeTransform } from "@angular/core";
import { orderBy } from 'lodash';


@Component({
  selector: 'app-view-book',
  templateUrl: './view-book.component.html',
  styleUrls: ['./view-book.component.css'],
  encapsulation: ViewEncapsulation.None
})

export class ViewBookComponent implements OnInit {
  users: User[] ;

  constructor(
    private userService: UserService,
    private snackBar: MatSnackBar) { }

  ngOnInit(): void {
    //initalize when component starts
    this.getAllUser();
  }

 
  //get all User
  getAllUser() {
    const promise = this.userService.getAllUser();
    promise.subscribe(
      (res:any) => {
         
        this.users = res;
        this.successSnackBar("User loaded successfully!");
      }, (err) => {
        this.errorSnackBar("Something went wrong !, Please try again");
        console.log(err);
      }
    );
  }


  // //sort book by name
 sortUser() {
     this.users.sort((user1, user2) => {
       return user1.username - user2.username;
    })
    this.successSnackBar("User sorted successfully!");
   }

  successSnackBar(message: string) {
    this.snackBar.open(message, 'X', {
      duration: 5000, panelClass: 'snackbar-success'
    });
  }

  errorSnackBar(message: string) {
    this.snackBar.open(message, 'X', {
      duration: 5000, panelClass: 'snackbar-error'
    });
  }

  key: string= 'id';
  reverse: boolean = false;
  sort(key){
    this.key = key;
    this.reverse = !this.reverse;
  }

}
