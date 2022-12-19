import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { StoreModule } from '@ngrx/store';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TodoReducer } from './reducers/Todo.reducer';
import { TodoComponentComponent } from './Components/todo-component/todo-component.component';
import { AddTodoComponentComponent } from './Components/add-todo-component/add-todo-component.component';

@NgModule({
  declarations: [
    AppComponent,
    TodoComponentComponent,
    AddTodoComponentComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    StoreModule.forRoot({todos:TodoReducer})
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
