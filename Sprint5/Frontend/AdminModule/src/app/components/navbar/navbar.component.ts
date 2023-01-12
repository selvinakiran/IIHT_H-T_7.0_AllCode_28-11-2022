import { Component, OnInit } from '@angular/core';
import { TokenStorageService } from 'src/app/services/token-storage.service';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  role: string = '';

  constructor(
    public tokenService: TokenStorageService,
    private userservice: UserService
  ) { }

  ngOnInit(): void {
    if (this.tokenService.getUser().role === undefined || this.tokenService.getUser().role === null) {
      this.role = '';
    } else {
      this.role = this.tokenService.getUser().role;
    }
  }

  signOut() {
    this.tokenService.signOut();
    this.role = '';
    
  }
  public roleMatch(allowedRole: string): boolean {

    let isMatched = false;

    const userRole: any = this.tokenService.getUser().role;

    if (userRole != null && userRole) {

      if (userRole === allowedRole) {

        isMatched = true;

      }

    }

    return isMatched;

  }

 

}
