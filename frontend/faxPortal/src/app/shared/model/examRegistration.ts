import {Course} from "./course";
import {Student} from "./student";
import {ExamPeriod} from "./examPeriod";

export class ExamRegistration{
  id: number;
  examPeriod: ExamPeriod;
  student: Student;
  courses: Course[];

  constructor(){

  }
}
