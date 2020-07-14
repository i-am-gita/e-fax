import { Component, OnInit } from '@angular/core';
import {Course} from "../../../shared/model/course";
import {ProfCourseService} from "../service/prof-course.service";
import {UserService} from "../../../service/user.service";

@Component({
  selector: 'app-prof-course-container',
  templateUrl: './prof-course-container.component.html',
  styleUrls: ['./prof-course-container.component.css']
})
export class ProfCourseContainerComponent implements OnInit {
  content = '';

  courses: Course[];

  constructor(
    private profCourseService: ProfCourseService, private userService: UserService
  ) { }

  ngOnInit(): void {
    // this.userService.getAdminBoard().subscribe(
    //   data => {
    //     this.content = data;
    //   },
    //   err => {
    //     this.content = JSON.parse(err.error).message;
    //   }
    // );
    this.profCourseService.courses.subscribe(data => this.courses = data);
    this.profCourseService.getCourses();
  }

  getGrades($event: Course){
    this.profCourseService.getGrades($event);
  }

}
