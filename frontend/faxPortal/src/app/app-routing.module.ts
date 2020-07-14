import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {IndexComponent} from "./components/index/index.component";
import {ExamRegistrationComponent} from "./components/exam-registration/exam-registration.component";
import {CourseContainerComponent} from "./components/course-components/course-container/course-container.component";
import {ProfCourseContainerComponent} from "./components/prof-course-components/prof-course-container/prof-course-container.component";
import {LoginComponent} from "./components/login/login.component";
import {HomeComponent} from "./components/home/home.component";


const appRoutes: Routes = [
  { path: 'login', component: LoginComponent},
  { path: 'home', component: HomeComponent},
  { path: 'kursevi', component: CourseContainerComponent},
  { path: 'indeks', component: IndexComponent },
  { path: 'profesor/kursevi', component: ProfCourseContainerComponent },
  { path: 'student/prijava-ispita', component: ExamRegistrationComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(appRoutes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
