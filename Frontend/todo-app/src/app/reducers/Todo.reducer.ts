import { ActionParent } from "../actions/Todo.actiontype";
import { Todo } from "../models/Todo";

const initialState:Todo [] =[
    {title:"title 1"},
    {title:"title 2"},
    {title:"title 3"}
];

//reducer has state and action
export function TodoReducer(state = initialState, action:ActionParent){
    switch(action.type) {
        default:return state;
    }
}