import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SidebarComponent } from './components/sidebar/sidebar.component';
import { TopNavbarComponent } from './components/top-navbar/top-navbar.component';
import { IndexComponent } from './components/index/index.component';
import { ExamRegistrationComponent } from './components/exam-registration/exam-registration.component';
import { CourseContainerComponent } from './components/course-components/course-container/course-container.component';
import { CourseListComponent } from './components/course-components/course-list/course-list.component';
import {CourseServiceService} from "./components/course-components/service/course-service.service";
import { ProfCourseContainerComponent } from './components/prof-course-components/prof-course-container/prof-course-container.component';
import { ProfCourseListComponent } from './components/prof-course-components/prof-course-list/prof-course-list.component';
import { GradesComponent } from './components/prof-course-components/prof-grades/grades/grades.component';
import { AddGradeComponent } from './components/prof-course-components/prof-grades/add-grade/add-grade.component';
import { FormsModule } from '@angular/forms';
import {ProfCourseService} from "./components/prof-course-components/service/prof-course.service";
import {ExamRegistrationService} from "./components/exam-registration/service/exam-registration.service";
import { LoginComponent } from './components/login/login.component';
import {HTTP_INTERCEPTORS, HttpClientModule} from "@angular/common/http";
import { HomeComponent } from './components/home/home.component';
import {authInterceptorProviders} from "./helpers/auth.interceptor";

@NgModule({
  declarations: [
    AppComponent,
    SidebarComponent,
    TopNavbarComponent,
    IndexComponent,
    ExamRegistrationComponent,
    CourseContainerComponent,
    CourseListComponent,
    ProfCourseContainerComponent,
    ProfCourseListComponent,
    GradesComponent,
    AddGradeComponent,
    LoginComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [
    CourseServiceService,
    ProfCourseService,
    ExamRegistrationService,
    authInterceptorProviders
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
