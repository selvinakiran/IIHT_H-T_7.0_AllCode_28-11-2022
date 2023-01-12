import { Component, OnInit } from '@angular/core';
import { TokenStorageService } from 'src/app/services/token-storage.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  constructor(
    private tokenservice:TokenStorageService
  ) { }

  ngOnInit(): void {
  }

  public isloggedin(){
    return this.tokenservice.isloggedin();
  }

}
