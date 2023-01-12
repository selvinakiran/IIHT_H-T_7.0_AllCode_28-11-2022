import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddUserComponent } from './components/add-user/add-user.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { SignUpComponent } from './components/sign-up/sign-up.component';
import { ViewUserComponent } from './components/view-user/view-user.component';
import { AddCompensationComponent } from './components/add-compensation/add-compensation.component';
import { ViewCompensationComponent } from './components/view-compensation/view-compensation.component';
import { ViewReportComponent } from './components/view-reports/view-reports.component';

const routes: Routes = [
  { path: "",pathMatch:'full',redirectTo:'home'},
  { path: "home", component: HomeComponent },
  { path: "login", component: LoginComponent },
  { path: "signup", component: SignUpComponent },
  { path: "adduser", component: AddUserComponent },
  { path: "addcompensation", component: AddCompensationComponent },
  { path: "viewuser", component: ViewUserComponent },
  { path: "viewcompensation", component: ViewCompensationComponent },
  { path: "viewreport", component: ViewReportComponent }
  
 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
