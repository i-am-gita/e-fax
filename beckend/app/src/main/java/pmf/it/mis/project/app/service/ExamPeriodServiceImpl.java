package pmf.it.mis.project.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pmf.it.mis.project.app.dto.ExamPeriodDto;
import pmf.it.mis.project.app.mapper.ExamPeriodMapper;
import pmf.it.mis.project.app.model.ExamPeriodEntity;
import pmf.it.mis.project.app.repository.ExamPeriodRepository;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class ExamPeriodServiceImpl implements ExamPeriodService{

    @Autowired
    private ExamPeriodRepository periodRepo;

    @Autowired
    ExamPeriodMapper periodMapper;

    @Autowired



    @Override
    public List<ExamPeriodDto> findAll() {
        return periodMapper.toExamPeriodDTOs(periodRepo.findAll());
    }

    @Override
    public String isExamPeriod(Date date) {
        Date now = new Date();
        String nameOfPeriod = "";

        List<ExamPeriodDto> periods = findAll();
        boolean isPeriodOfRegistration = false;
        for(ExamPeriodDto period : periods){
            if (now.after(period.getRegPeriodStart()) && now.before(period.getRegPeriodEnd())){
                isPeriodOfRegistration = true;
                nameOfPeriod = period.getName();
                break;
            }
        }
        if(isPeriodOfRegistration)
            return nameOfPeriod;
        else
            return null;

    }
}
