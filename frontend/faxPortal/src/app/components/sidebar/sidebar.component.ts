import { Component, OnInit } from '@angular/core';
import {ExamRegistrationService} from "../exam-registration/service/exam-registration.service";
import {Course} from "../../shared/model/course";
import {ActivatedRoute, Router} from "@angular/router";
import {TokenStorageService} from "../../service/token-storage.service";

@Component({
  selector: 'app-sidebar',
  templateUrl: './sidebar.component.html',
  styleUrls: ['./sidebar.component.css']
})
export class SidebarComponent implements OnInit {

  private roles: string[];
  isLoggedIn = false;
  showStudentBoard = false;


  listeningCourses: Course[];
  examPeriodName: string;

  constructor(private examRegistrationService: ExamRegistrationService,
              private router: Router,
              private route: ActivatedRoute,
              private tokenStorageService: TokenStorageService) { }

  ngOnInit(): void {
    //this.listeningCourses = this.examRegistrationService.getListeningCourses();

    this.isLoggedIn = !!this.tokenStorageService.getToken();

    if(this.isLoggedIn){
      const user = this.tokenStorageService.getUser();
      this.roles = user.roles;
      this.showStudentBoard = this.roles.includes('ROLE_STUDENT');
    }

  }

  isExamPeriod(){
    let isExamPer = false;
    let currentDate: Date = new Date();
    let month = currentDate.getMonth();
    let day = currentDate.getDay();

    this.examRegistrationService.getExamPeriods();

    if(isExamPer){

      this.examRegistrationService.getListeningCourses();
    }else{

    }

    this.router.navigate(['student/prijava-ispita'], {relativeTo: this.route});


  }

}
