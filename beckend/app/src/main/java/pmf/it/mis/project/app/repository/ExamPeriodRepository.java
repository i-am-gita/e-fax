package pmf.it.mis.project.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pmf.it.mis.project.app.model.ExamPeriodEntity;

import java.util.List;
import java.util.Set;

@Repository
public interface ExamPeriodRepository extends JpaRepository<ExamPeriodEntity, Integer> {

    List<ExamPeriodEntity> findAll();
}
