import { Component, OnInit, ViewEncapsulation } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import Compensation from 'src/app/models/compensation';
import { CompensationService } from 'src/app/services/compensation.service';



@Component({
  selector: 'app-view-compensation',
  templateUrl: './view-compensation.component.html',
  styleUrls: ['./view-compensation.component.css'],
  encapsulation: ViewEncapsulation.None
})

export class ViewCompensationComponent implements OnInit {
  compensation: Compensation[] = [] ;
  page:number=1;


  constructor(
    private compensationService: CompensationService,
    private snackBar: MatSnackBar) { }

  ngOnInit(): void {
    //initalize when component starts
    this.getAllCompensation();
  }

 
  //get all Compensation
  getAllCompensation() {
    const promise = this.compensationService.getAllCompensation();
    promise.subscribe(
      (res:any) => {
         
        this.compensation = res;
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

 



}
