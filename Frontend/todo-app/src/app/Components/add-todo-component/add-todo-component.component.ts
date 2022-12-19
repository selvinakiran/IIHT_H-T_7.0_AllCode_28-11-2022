import { Component, OnInit } from '@angular/core';
import { TodoAdd } from 'src/app/actions/Todo.actiontype';
import { Todo } from 'src/app/models/Todo';
import { Store } from '@ngrx/store'

@Component({
  selector: 'app-add-todo-component',
  templateUrl: './add-todo-component.component.html',
  styleUrls: ['./add-todo-component.component.css']
})
export class AddTodoComponentComponent implements OnInit {

  constructor(private store:Store<{todos:Todo[]}>) { }

  AddTodo(todo:string){

    const newTodo = new Todo();
    newTodo.title=todo;
    this.store.dispatch(new TodoAdd(newTodo))

  }

  ngOnInit(): void {
  }

}
