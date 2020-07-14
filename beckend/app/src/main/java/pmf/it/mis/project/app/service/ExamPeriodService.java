package pmf.it.mis.project.app.service;

import pmf.it.mis.project.app.dto.ExamPeriodDto;

import java.util.Date;
import java.util.List;

public interface ExamPeriodService {

    List<ExamPeriodDto> findAll();

    String isExamPeriod(Date date);

}
