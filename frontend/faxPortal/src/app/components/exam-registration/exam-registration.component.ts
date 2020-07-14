import {Component, ElementRef, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {Course} from "../../shared/model/course";
import {NgForm} from "@angular/forms";
import {ExamRegistrationService} from "./service/exam-registration.service";
import {ExamRegistration} from '../../shared/model/examRegistration';

@Component({
  selector: 'app-exam-registration',
  templateUrl: './exam-registration.component.html',
  styleUrls: ['./exam-registration.component.css']
})
export class ExamRegistrationComponent implements OnInit {

  examRegistration: ExamRegistration;
  listeningCourses: Course[];
  examPeriodName: string;

  constructor(private examRegistrationService: ExamRegistrationService) { }

  ngOnInit(): void {
    this.listeningCourses = this.examRegistrationService.listeningCourses;
    this.examPeriodName = this.examRegistrationService.examPeriodName;
  }

  processExamRegistrationForm(form: NgForm) {
    //Ovde procesuirati formu i napraviti instancu prijavljivanjaIspita koja se salje u bazu
  }
}
