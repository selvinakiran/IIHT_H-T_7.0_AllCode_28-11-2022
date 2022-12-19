import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddBooksComponent } from './Components/add-books/add-books.component';
import { GetBooksComponent } from './Components/get-books/get-books.component';
import { HomeComponent } from './Components/home/home.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: "Add-books", component: AddBooksComponent },
  { path: "Get-books", component: GetBooksComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
