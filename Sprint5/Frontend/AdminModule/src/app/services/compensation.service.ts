import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { TokenStorageService } from './token-storage.service';
import compensation  from 'src/app/models/compensation';


const BASE_URL = "http://ec2-3-86-159-19.compute-1.amazonaws.com:5000/api/adminmodule";

//const BASE_URL = "http://localhost:5000/api/adminmodule";





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

  
    compensationobj = new compensation;
   //create new Compensation
   createCompensation(compensationobj) {
      console.log(compensationobj);
      
    return this.http.post(BASE_URL + "/compensation", compensationobj, this.httpOptions);
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
