import { Component, OnInit, ViewEncapsulation } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import compensation  from 'src/app/models/compensation';
import { CompensationService } from 'src/app/services/compensation.service';



@Component({
  selector: 'app-view-compensation',
  templateUrl: './view-compensation.component.html',
  styleUrls: ['./view-compensation.component.css'],
  encapsulation: ViewEncapsulation.None
})

export class ViewCompensationComponent implements OnInit {
  compensation: compensation[] ;
  page:number=1;
  //compensation: Compensation = new Compensation();

  


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
         console.log(res);
         
        this.compensation = res;
        this.reverse=false;
        this.successSnackBar("User loaded successfully!");
      }, (err) => {
        this.errorSnackBar("Something went wrong !, Please try again");
        console.log(err);
      }
    );
  }

  deleteplan(Compensation: any, index: any) {
    const observable = this.compensationService.deleteplan(Compensation);
    observable.subscribe(
      (res) => {
        console.log(res);
        this.compensation.splice(1,index);
        this.successSnackBar("Compensation Plan deleted successfully!");
        this.getAllCompensation();
      }, (err) => {
        this.errorSnackBar("Something went wrong !, Please try again");
        console.log(err);
      }
    )
  }

  deleteBook(book: any, index: any) {
    const observable = this.compensationService.deleteplan(compensation);
    observable.subscribe(
      (res) => {
        console.log(res);
       this.compensation.splice(index, 1);
      }
    )
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

 key: string = 'planid';
 reverse: boolean = false;
 sort(key) {
   this.key = key;
   this.reverse = !this.reverse;
 }



}
