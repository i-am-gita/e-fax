import { Component, OnInit, Output, Input, EventEmitter } from '@angular/core';
import {Course} from "../../../shared/model/course";
import {CourseServiceService} from "../service/course-service.service";
import {TokenStorageService} from "../../../service/token-storage.service";
import {Observable} from "rxjs";

@Component({
  selector: 'app-course-list',
  templateUrl: './course-list.component.html',
  styleUrls: ['./course-list.component.css']
})
export class CourseListComponent implements OnInit {

  @Input() courses: Observable<Course[]>;
  @Output() enrolledCourse = new EventEmitter();

  constructor(private courseService: CourseServiceService, private tokenService: TokenStorageService) { }

  ngOnInit(): void {
    this.reloadData()
  }

  reloadData(){
    this.courses = this.courseService.getCourses(this.tokenService.getUser().id);
  }

  enrollInCourse(course: Course){
    console.log(course);
    this.enrolledCourse.emit(course);
  }

}
