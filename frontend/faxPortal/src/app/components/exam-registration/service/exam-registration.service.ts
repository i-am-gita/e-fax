import { Injectable } from '@angular/core';
import {Course} from "../../../shared/model/course";
import {ExamPeriod} from "../../../shared/model/examPeriod";

@Injectable({
  providedIn: 'root'
})
export class ExamRegistrationService {

  listeningCourses: Course[] = [];
  examPeriodName: string;
  examPeriods: ExamPeriod[];

  constructor() { }

  setListeningCourses(data: Course[]){
    this.listeningCourses = data;
  }

  getListeningCourses(){
    //http request this.http.get('api/courses').then(
    // data => {  this.setCourses( data ); }
    // error => { console.error( error.message );}
    // );

   // this.setListeningCourses();
  }

  getExamPeriods(){


  }


  processExamRegistrationForm(){

  }


}
