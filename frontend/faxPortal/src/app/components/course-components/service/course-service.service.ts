import { Injectable } from '@angular/core';
import { Course } from 'src/app/shared/model/course';
import {generate, BehaviorSubject, Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";
import {TokenStorageService} from "../../../service/token-storage.service";
import {CourseDto} from "../../../shared/dto/courseDto";

const API_URL = 'http://localhost:8080/';

@Injectable({
  providedIn: 'root'
})
export class CourseServiceService {

  private coursesOb = new BehaviorSubject<Course[]>([]);
  private coursesHolder: Course[] = [];
  courses = this.coursesOb.asObservable();

  constructor(private http: HttpClient, private tokenStorageService: TokenStorageService) { }

  setCourses(data: Course[]){
    this.coursesHolder = data;
    this.coursesOb.next(this.coursesHolder);
  }

  getCourses(idStudent: string): Observable<any>{

    return this.http.get(API_URL+'student/kursevi/'+idStudent);
  }

  getCourse(id: number): Observable<Object>{
    return this.http.get(API_URL+'kurs/'+id);
  }

  enroll(course: Course){
    // this.http.put( `api/courses/${course.id}`, course ).then( data => { } );
    // this.coursesHolder.forEach( data => { if(data.id == course.id) data.desc = course.desc } );
    // this.setCourses( this.coursesHolder );
  }

  generateCourses(): Course[] {
    const c1 = new Course();
    c1.id = 1;
    c1.title = 'Veštačka inteligencija';
    c1.espb = 5;
    c1.desc = 'Cilj istraživanja veštačke inteligencije je razvijanje softvera, koji će omogućiti računarima da se ponašaju na način koji bi se mogao okarakterisati inteligentnim';
    const c2 = new Course();
    c2.id = 2;
    c2.title = 'Testiranje softvera';
    c2.espb = 4;
    c2.desc = 'Pre puštanja softvera u produkciju moramo biti sigurni da nema skrivenih problema. Ovo postižemo testiranjem i ovom temom ćemo se baviti na ovom kursu';

    const c3 = new Course();
    c3.id = 3;
    c3.title = 'Testiranje softvera';
    c3.espb = 4;
    c3.desc = 'Pre puštanja softvera u produkciju moramo biti sigurni da nema skrivenih problema. Ovo postižemo testiranjem i ovom temom ćemo se baviti na ovom kursu';
    const c4 = new Course();
    c4.id = 4;
    c4.title = 'Testiranje softvera';
    c4.espb = 4;
    c4.desc = 'Pre puštanja softvera u produkciju moramo biti sigurni da nema skrivenih problema. Ovo postižemo testiranjem i ovom temom ćemo se baviti na ovom kursu';
    const c5 = new Course();
    c5.id = 5;
    c5.title = 'Testiranje softvera';
    c5.espb = 4;
    c5.desc = 'Pre puštanja softvera u produkciju moramo biti sigurni da nema skrivenih problema. Ovo postižemo testiranjem i ovom temom ćemo se baviti na ovom kursu';
    const c6 = new Course();
    c6.id = 6;
    c6.title = 'Testiranje softvera';
    c6.espb = 4;
    c6.desc = 'Pre puštanja softvera u produkciju moramo biti sigurni da nema skrivenih problema. Ovo postižemo testiranjem i ovom temom ćemo se baviti na ovom kursu';


    return [c1, c2, c3,c4,c5,c6];
  }
}
