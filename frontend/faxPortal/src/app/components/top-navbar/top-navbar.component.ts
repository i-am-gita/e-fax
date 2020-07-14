import { Component, OnInit } from '@angular/core';
import {TokenStorageService} from "../../service/token-storage.service";

@Component({
  selector: 'app-top-navbar',
  templateUrl: './top-navbar.component.html',
  styleUrls: ['./top-navbar.component.css']
})
export class TopNavbarComponent implements OnInit {

  constructor(private tokenStorageService: TokenStorageService) { }

  private roles: string[];
  isLoggedIn = false;
  showAdminBoard = false;
  showProfessorBoard = false;
  showAssistantBoard = false;
  showStudentBoard = false;
  username: string;

  ngOnInit(): void {
    this.isLoggedIn = !!this.tokenStorageService.getToken();

    if(this.isLoggedIn){
      const user = this.tokenStorageService.getUser();
      this.roles = user.roles;

      this.showAdminBoard = this.roles.includes('ROLE_ADMIN');
      this.showProfessorBoard = this.roles.includes('ROLE_PROFESSOR');
      this.showAssistantBoard = this.roles.includes('ROLE_ASSISTANT');
      this.showStudentBoard = this.roles.includes('ROLE_STUDENT');

      this.username = user.username;

    }
  }

  toggleSidebar() {
    const wrapper = <HTMLElement>document.querySelector("#wrapper");
    wrapper.classList.toggle("toggled");
  }

  logout(){
    this.tokenStorageService.signOut();
    window.location.reload();
  }
}
