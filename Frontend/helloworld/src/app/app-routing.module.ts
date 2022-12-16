import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutComponent } from './Components/about/about.component';
import { ContactComponent } from './Components/contact/contact.component';
import { HomeComponent } from './Components/home/home.component';
import { PipesComponent } from './Components/pipes/pipes.component';
import { RegUsersComponent } from './Components/reg-users/reg-users.component';
import { UserformComponent } from './Components/userform/userform.component';

const routes: Routes = [{path:"",component:HomeComponent},
{path:"register",component:UserformComponent},
{path:"reg",component:RegUsersComponent},
{path:"about",component:AboutComponent},
{path:"contact",component:ContactComponent},
{path:"pipe",component:PipesComponent}];




@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
