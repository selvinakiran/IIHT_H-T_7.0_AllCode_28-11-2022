import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipes',
  templateUrl: './pipes.component.html',
  styleUrls: ['./pipes.component.css']
})
export class PipesComponent implements OnInit {

  employee = {
    "name":"Dr.A.B.J.Abdul Kalam",
    "BaseSalary":50000,
    "JoinedOn" :Date.now(),
    "Qualification":"Aeronautical Engineer",
    "About":"Avul Pakir Jainulabdeen Abdul Kalam was an Indian aerospace scientist and statesman who served as the 11th President of India from 2002 to 2007. He was born and raised in Rameswaram, Tamil Nadu and studied physics and aerospace engineering.",
    "WinningPertencage":95/100

  }

  about()
  {
     About:"Avul Pakir Jainulabdeen Abdul Kalam was an Indian aerospace scientist and statesman who served as the 11th President of India from 2002 to 2007. He was born and raised in Rameswaram, Tamil Nadu and studied physics and aerospace engineering."
  }

  constructor() { }

  ngOnInit(): void {
  }

}
