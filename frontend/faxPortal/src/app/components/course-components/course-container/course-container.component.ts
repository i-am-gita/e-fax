import { Component, OnInit } from '@angular/core';
import {Course} from "../../../shared/model/course";
import {CourseServiceService} from "../service/course-service.service";
import {Observable} from "rxjs";

@Component({
  selector: 'app-course-container',
  templateUrl: './course-container.component.html',
  styleUrls: ['./course-container.component.css']
})
export class CourseContainerComponent implements OnInit {

  courses: Course[];
  course: Observable<Object>;

  constructor(private courseService: CourseServiceService) { }

  ngOnInit(): void {
    this.course = this.courseService.getCourse(1);
    this.courseService.courses.subscribe(data => this.courses = data);
  }

  enroll($event: Course){
    this.courseService.enroll($event);
  }

}
