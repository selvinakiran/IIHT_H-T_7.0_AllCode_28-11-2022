import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

const Base_URL = 'http://localhost:5000/users';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  saveUser(user: {
    firstname: String;
    lastname: String;
    age: number;
    gender: String;
    email: String;
  }){
    return this.http.post(Base_URL,user);
  }

  getUsers(){
    return this.http.get(Base_URL);
  }

  deleteUsers(user){
    return this.http.get(Base_URL + "/" + user.id);
  }

  constructor(private http: HttpClient) { }
}
