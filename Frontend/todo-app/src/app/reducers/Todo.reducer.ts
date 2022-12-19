import { ActionParent } from "../actions/Todo.actiontype";
import { Todo } from "../models/Todo";
import { TodoActionType } from "../shared/Todo.actiontype.enum";

const initialState:Todo [] =[
    {title:"title 1"},
    {title:"title 2"},
    {title:"title 3"}
];

//reducer has state and action
export function TodoReducer(state = initialState, action:ActionParent){
    switch(action.type) {
        case TodoActionType.Add:
            return [...state,action.payload]

        case TodoActionType.Remove:
            let newstate =[...state];
            newstate.splice(action.payload,1);
            return newstate;

        default:return state;
    }
}