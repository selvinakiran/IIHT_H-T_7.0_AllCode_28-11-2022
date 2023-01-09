import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

//const BASE_URL = "http://ec2-44-201-223-149.compute-1.amazonaws.com:5000/api/adminmodule";

const BASE_URL = "http://localhost:5000/api/adminmodule";

const reqHeaders = new HttpHeaders({
  'Content-Type': 'application/json'
})

const httpOptions = {
  headers: reqHeaders
};

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient) { }

  //create new user
  createUser(user: {
    username: string;
    firstName: string;
    lastName: string;
    location: string;
    jobtitle: string;
    department: string;
    role: string;
    password: string;
  }) {
    return this.http.post(BASE_URL + "/sign-up", user, httpOptions);
  }

  //login
  login(request: {
    username: string;
    password: string;
  }) {
    return this.http.post(BASE_URL + "/sign-in", request, httpOptions);
  }
}
