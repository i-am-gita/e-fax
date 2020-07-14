import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {Course} from "../../../shared/model/course";
import {ProfCourseService} from "../service/prof-course.service";

@Component({
  selector: 'app-prof-course-list',
  templateUrl: './prof-course-list.component.html',
  styleUrls: ['./prof-course-list.component.css']
})
export class ProfCourseListComponent implements OnInit {

  @Input() courses: Course[];
  @Output() gradesForCourse = new EventEmitter();




  constructor(private profCourseService: ProfCourseService) { }

  ngOnInit(): void {
  }

  openGrades(course: Course){
    document.querySelector(".grades").setAttribute("style","visibility:visible; margin-top:20px");
    document.querySelector(".grid").setAttribute("style","visibility:hidden;");

    //Ovde dobijamo ocene
    this.profCourseService.selectedCourse = course;
    //this.profCourseService.getGrades(course);

  }



}
