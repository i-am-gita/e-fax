package pmf.it.mis.project.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pmf.it.mis.project.app.model.ExamRegistrationEntity;
import pmf.it.mis.project.app.repository.ExamRegistrationRepository;

import javax.transaction.Transactional;

@Service
@Transactional
public class ExamRegistrationServiceImpl implements ExamRegistrationService{

    @Autowired
    private ExamRegistrationRepository examRegRepo;

    @Override
    public ExamRegistrationEntity save(ExamRegistrationEntity examReg) {
        return examRegRepo.save(examReg);
    }
}
