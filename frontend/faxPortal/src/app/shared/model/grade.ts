import {Student} from "./student";
import {Course} from "./course";

export class Grade{
  id: number;
  course: Course;
  student: Student;
  points: number;
  finalMark: number;
  professorsComment: string;

  constructor() {
  }
}
