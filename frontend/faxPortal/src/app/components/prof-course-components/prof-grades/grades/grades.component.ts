import { Component, OnInit } from '@angular/core';
import {ProfCourseService} from "../../service/prof-course.service";
import {Grade} from "../../../../shared/model/grade";
import {Course} from "../../../../shared/model/course";

@Component({
  selector: 'app-grades',
  templateUrl: './grades.component.html',
  styleUrls: ['./grades.component.css']
})
export class GradesComponent implements OnInit {

  grades: Grade[];

  constructor(private profCourseService: ProfCourseService) { }

  ngOnInit(): void {
    this.profCourseService.grades.subscribe(data => this.grades = data);
    //this.profCourseService.getGrades();
  }

  closeGrades(){
    document.querySelector(".grades").setAttribute("style","visibility:hidden;");
    document.querySelector(".grid").setAttribute("style","visibility:visible;");
    document.querySelector(".alert").setAttribute("style","visibility:hidden;");

  }

  addGrade(){
    document.querySelector(".add-grade-card").setAttribute("style","visibility:visible;");
    document.querySelector(".grades").setAttribute("style","visibility:hidden;");
  }


}
