package pmf.it.mis.project.app.service;

import pmf.it.mis.project.app.dto.CourseStudentDto;
import pmf.it.mis.project.app.dto.ExamRegistrationInfoDto;
import pmf.it.mis.project.app.model.ExamRegistrationEntity;


public interface ExamRegistrationService {

    ExamRegistrationEntity save(ExamRegistrationEntity examReg);

    ExamRegistrationInfoDto getExamPeriod(String periodOfRegistration, String idStudent);
}
