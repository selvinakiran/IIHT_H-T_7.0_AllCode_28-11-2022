import { Component, OnInit, ViewEncapsulation } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import User from 'src/app/models/user';
import { UserService } from 'src/app/services/user.service';



@Component({
  selector: 'app-view-book',
  templateUrl: './view-user.component.html',
  styleUrls: ['./view-user.component.css'],
  encapsulation: ViewEncapsulation.None
})

export class ViewUserComponent implements OnInit {
  users: User[] = [] ;
  totalLength : any;
  page:number=1;


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
       // this.reverse=false;
        this.successSnackBar("User loaded successfully!");
      }, (err) => {
        this.errorSnackBar("Something went wrong !, Please try again");
        console.log(err);
      }
    );
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

  


  key: string = 'id';
  reverse: boolean = true;
  sort(key) {
    this.key = key;
    this.reverse = !this.reverse;
  }


}
