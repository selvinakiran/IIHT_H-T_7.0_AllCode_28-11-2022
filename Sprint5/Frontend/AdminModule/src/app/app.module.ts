import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';


import { NoopAnimationsModule } from '@angular/platform-browser/animations';
import { NavbarComponent } from './components/navbar/navbar.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { SignUpComponent } from './components/sign-up/sign-up.component';
import { HeaderComponent } from './components/header/header.component';
import { FooterComponent } from './components/footer/footer.component';
import { ReactiveFormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { AddUserComponent } from './components/add-user/add-user.component';
import { AddCompensationComponent } from './components/add-compensation/add-compensation.component';
import { MatCardModule } from '@angular/material/card';
import { ViewUserComponent } from './components/view-user/view-user.component';
import { ViewCompensationComponent } from './components/view-compensation/view-compensation.component';
import { ViewReportComponent } from './components/view-reports/view-reports.component';
import { MatSnackBarModule } from '@angular/material/snack-bar';
import { NgxPaginationModule } from 'ngx-pagination';
import { Ng2OrderModule } from 'ng2-order-pipe';


@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    HomeComponent,
    LoginComponent,
    SignUpComponent,
    HeaderComponent,
    FooterComponent,
    AddUserComponent,
    AddCompensationComponent,
    ViewUserComponent,
    ViewCompensationComponent,
    ViewReportComponent
    
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NoopAnimationsModule,
    ReactiveFormsModule,
    HttpClientModule,
    CommonModule,
    MatCardModule,
    MatSnackBarModule,
    NgxPaginationModule,
    Ng2OrderModule
   
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
