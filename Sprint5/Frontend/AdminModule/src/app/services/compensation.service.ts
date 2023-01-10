import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { TokenStorageService } from './token-storage.service';

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
export class CompensationService {

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

  

   //create new Compensation
   createCompensation(Compensation: {
    planid: number;
    partnername: string;
    compensationplan: string ;
    validto: string ; 
    validfrom: string ;
    calculation: string ;
    
  }) {
    return this.http.post(BASE_URL + "/add-compensation", Compensation, httpOptions);
  }

  getAllCompensation() {
    return this.http.get(BASE_URL + "/allcompensation", this.httpOptions);
  }

  deleteCompensation(Compensation: any) {
    return this.http.delete(BASE_URL + "/delete" , this.httpOptions);
  }

  //download excel report

  downloadreport() {
    return this.http.get(BASE_URL + "/export/compensations", this.httpOptions);
  }
  

}
