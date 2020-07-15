package pmf.it.mis.project.app.service;

import com.netflix.client.IResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import pmf.it.mis.project.app.dto.CourseStudentDto;
import pmf.it.mis.project.app.dto.ExamRegistrationInfoDto;
import pmf.it.mis.project.app.model.ExamRegistrationEntity;
import pmf.it.mis.project.app.repository.ExamRegistrationRepository;

import javax.transaction.Transactional;
import java.util.Set;

@Service
@Transactional
public class ExamRegistrationServiceImpl implements ExamRegistrationService{

    @Autowired
    private ExamRegistrationRepository examRegRepo;

    @Autowired
    private CourseService courseService;

    @Override
    public ExamRegistrationEntity save(ExamRegistrationEntity examReg) {

        return examRegRepo.save(examReg);
    }

    @Override
    public ExamRegistrationInfoDto getExamPeriod(String periodOfRegistration, String idStudent) {
        if(periodOfRegistration != null){
            Set<CourseStudentDto> listeningCourses = courseService.findListeningCoursesForStudent(idStudent);
            ExamRegistrationInfoDto response = new ExamRegistrationInfoDto(periodOfRegistration, listeningCourses);
            return response;
        }
        return  null;
    }
}
