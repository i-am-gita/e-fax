import { Injectable } from '@angular/core';
import { Course } from 'src/app/shared/model/course';
import { Professor} from "../../../shared/model/professor";
import {BehaviorSubject} from "rxjs";
import {Grade} from "../../../shared/model/grade";

@Injectable({
  providedIn: 'root'
})
export class ProfCourseService {

  private coursesOb = new BehaviorSubject<Course[]>([]);
  private coursesHolder: Course[] = [];
  courses = this.coursesOb.asObservable();

  private gradesOb = new BehaviorSubject<Grade[]>([]);
  private gradesHolder: Grade[] = [];
  grades = this.gradesOb.asObservable();

  selectedCourse: Course;

  constructor() { }

  setCourses(data: Course[]){
    this.coursesHolder = data;
    this.coursesOb.next(this.coursesHolder);
  }

  setGrades(data: Grade[]){
    this.gradesHolder = data;
    this.gradesOb.next(this.gradesHolder);
  }

  getGrades(course: Course){
    // this.http.put( `api/courses/${course.id}`, course ).then( data => { } );
    // this.coursesHolder.forEach( data => { if(data.id == course.id) data.desc = course.desc } );
    // this.setCourses( this.coursesHolder );

  }

  getCourses(){
    //http request this.http.get('api/courses').then(
    // data => {  this.setCourses( data ); }
    // error => { console.error( error.message );}
    // );
    this.setCourses(this.generateCourses());
  }

  generateCourses(): Course[] {

    const p1 = new Professor();
    p1.id = "prof123";
    p1.firstname = "Danijela";
    p1.lastname = "Boberic";

    const c1 = new Course();
    c1.id = 1;
    c1.title = 'Veštačka inteligencija';
    c1.espb = 5;
    c1.desc = 'Cilj istraživanja veštačke inteligencije je razvijanje softvera, koji će omogućiti računarima da se ponašaju na način koji bi se mogao okarakterisati inteligentnim';
    c1.professor = p1;

    const c2 = new Course();
    c2.id = 2;
    c2.title = 'Testiranje softvera';
    c2.espb = 4;
    c2.desc = 'Pre puštanja softvera u produkciju moramo biti sigurni da nema skrivenih problema. Ovo postižemo testiranjem i ovom temom ćemo se baviti na ovom kursu';
    c2.professor = p1;

    const c3 = new Course();
    c3.id = 3;
    c3.title = 'Testiranje softvera';
    c3.espb = 4;
    c3.desc = 'Pre puštanja softvera u produkciju moramo biti sigurni da nema skrivenih problema. Ovo postižemo testiranjem i ovom temom ćemo se baviti na ovom kursu';
    c3.professor = p1;

    const c4 = new Course();
    c4.id = 4;
    c4.title = 'Testiranje softvera';
    c4.espb = 4;
    c4.desc = 'Pre puštanja softvera u produkciju moramo biti sigurni da nema skrivenih problema. Ovo postižemo testiranjem i ovom temom ćemo se baviti na ovom kursu';
    c4.professor = p1;
    const c5 = new Course();
    c5.id = 5;
    c5.title = 'Testiranje softvera';
    c5.espb = 4;
    c5.desc = 'Pre puštanja softvera u produkciju moramo biti sigurni da nema skrivenih problema. Ovo postižemo testiranjem i ovom temom ćemo se baviti na ovom kursu';
    c5.professor = p1;

    const c6 = new Course();
    c6.id = 6;
    c6.title = 'Testiranje softvera';
    c6.espb = 4;
    c6.desc = 'Pre puštanja softvera u produkciju moramo biti sigurni da nema skrivenih problema. Ovo postižemo testiranjem i ovom temom ćemo se baviti na ovom kursu';
    c6.professor = p1;

    return [c1, c2, c3,c4,c5,c6];
  }
}
