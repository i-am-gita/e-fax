package pmf.it.mis.project.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;
import pmf.it.mis.project.app.model.ExamRegistrationEntity;

@Repository
public interface ExamRegistrationRepository extends JpaRepository<ExamRegistrationEntity, Integer> {

    ExamRegistrationEntity save(@RequestParam  ExamRegistrationEntity examReg);
}
