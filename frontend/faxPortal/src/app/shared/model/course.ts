import {Professor} from "./professor";
import {Assistant} from "./assistant";
import {Grade} from "./grade";
import {Student} from "./student";

export class Course{
  id: number;
  enrollmentPassword: string;
  title: string;
  espb: number;
  desc: string;
  professor: Professor;
  assistants: Assistant[];
  grades: Grade[];
  enrolledStudents: Student[];


  constructor(){

  }
}
