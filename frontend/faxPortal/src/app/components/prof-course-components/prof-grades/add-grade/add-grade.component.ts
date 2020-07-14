import { Component, OnInit } from '@angular/core';
import {ProfCourseService} from "../../service/prof-course.service";
import {NgForm} from "@angular/forms";
import {Course} from "../../../../shared/model/course";
import {Student} from "../../../../shared/model/student";

@Component({
  selector: 'app-add-grade',
  templateUrl: './add-grade.component.html',
  styleUrls: ['./add-grade.component.css']
})
export class AddGradeComponent implements OnInit {

  course: Course;
  enrolledStudents: Student[];

  constructor(private profCourseService: ProfCourseService) { }

  ngOnInit(): void {
  }

  addGradeSuccess(form: NgForm){
    document.querySelector(".grades").setAttribute("style","visibility:visible;");
    document.querySelector(".add-grade-card").setAttribute("style","visibility:hidden;");
    document.querySelector(".alert").setAttribute("style","visibility:visible;");

    this.course = this.profCourseService.selectedCourse;
    this.enrolledStudents = this.course.enrolledStudents;
    //Dalje kupimo podatke sa forme i pravimo ocenu te je ubacujemo u bazu. Nakon toga bi obzervable trebalo da skonta
    // da smo je ubacili i da je prikaze odmah.
  }

}
