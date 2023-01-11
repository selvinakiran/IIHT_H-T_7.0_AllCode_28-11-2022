import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { TokenStorageService } from './token-storage.service';

//const BASE_URL = "http://ec2-44-201-223-149.compute-1.amazonaws.com:5000/api/adminmodule";

const BASE_URL = "http://localhost:5000/api/adminmodule";





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
   createCompensation(compensation: {
    partnername: string;
    compensationplan: string;
    validto: Date; 
    validfrom: Date;
    calculation: string;
    }) {
      console.log(compensation);
      
    return this.http.post(BASE_URL + "/compensation", compensation, this.httpOptions);
  }


  getAllCompensation() {
    return this.http.get(BASE_URL + "/compensationvalue", this.httpOptions);
  }

  deleteplan(compensation: any) {
    return this.http.delete(BASE_URL + "/delete/" + compensation.planid, this.httpOptions);
  }


  //download excel report

  public exportreport(){

    return this.http.get(BASE_URL + "/export/compensations", {

      responseType: 'blob'

    });

  }
  

}
