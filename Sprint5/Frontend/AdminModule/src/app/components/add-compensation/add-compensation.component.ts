import { Component, OnInit, ViewEncapsulation } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MatSnackBar } from '@angular/material/snack-bar';
import Compensation from 'src/app/models/compensation';
import { CompensationService } from 'src/app/services/compensation.service';

@Component({
  selector: 'app-add-compensation',
  templateUrl: './add-compensation.component.html',
  styleUrls: ['./add-compensation.component.css'],
  encapsulation: ViewEncapsulation.None
})
export class AddCompensationComponent implements OnInit {
  //Form Validables 
  RegisterForm: any = FormGroup;
  submitted = false;
  compensation: Compensation = new Compensation();
 

  constructor(private formBuilder: FormBuilder,
    private compensationService: CompensationService,
    private snackBar: MatSnackBar
  ) { }

  ngOnInit(): void {
    //Add User form validations
    this.RegisterForm = this.formBuilder.group({
      partnername: ['', [Validators.required, Validators.pattern]],
      compensationplan: ['', [Validators.required]],
      validto: ['', [Validators.required]],
      validfrom: ['', [Validators.required]],
      calculation: ['', [Validators.required]]
   });
  }

  //Add user form actions
  get f() { return this.RegisterForm.controls; }

  onSubmit() {
    this.submitted = true;
    // stop here if form is invalid
    if (this.RegisterForm.invalid) {
      return;
    }
    //True if all the fields are filled
    if (this.submitted) {
      this.createCompensation();
    }
  }

  //create new compensation
  createCompensation() {
    const observables = this.compensationService.createCompensation(this.compensation);
    observables.subscribe(
      (res: any) => {
        console.log(res);
        this.successSnackBar("The compensation is created successfully!");
      }, (err) => {
        this.errorSnackBar("Something went wrong !, Please try again");
        console.log(err);
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

}
