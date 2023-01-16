import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { TokenStorageService } from './token-storage.service';

const BASE_URL = "http://ec2-54-166-57-97.compute-1.amazonaws.com:5000/api/adminmodule";

//const BASE_URL = "http://localhost:5000/api/adminmodule";

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

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json',
      'Authorization': 'Bearer ' + this.tokenService.getToken()
    })
  };

  constructor(
    private http: HttpClient,
    private tokenService: TokenStorageService,
  ) { }

  
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

  getAllUser() {
    return this.http.get(BASE_URL + "/user", this.httpOptions);
  }

  
}
