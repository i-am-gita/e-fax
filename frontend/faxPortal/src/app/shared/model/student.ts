import {Course} from "./course";
import {Grade} from "./grade";

export class Student{
  id: string; //UID
  username: string;
  password: string;
  firstname: string;
  lastname: string;
  courses: Course[];
  grades: Grade[];

  constructor(){

  }
}
