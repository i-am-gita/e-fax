package pmf.it.mis.project.survey.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pmf.it.mis.project.survey.service.ReviewMapper;
import pmf.it.mis.project.survey.service.dto.CourseDto;
import pmf.it.mis.project.survey.service.dto.SurveyDto;
import pmf.it.mis.project.survey.service.mapper.SurveyMapper;
import pmf.it.mis.project.survey.service.model.ReviewEntity;
import pmf.it.mis.project.survey.service.model.SurveyEntity;
import pmf.it.mis.project.survey.service.repository.SurveyRepository;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Transactional
public class SurveyServiceImpl implements SurveyService {

    @Autowired
    private ReviewService reviewService;

    @Autowired
    private ReviewMapper reviewMapper;

    @Autowired
    private SurveyRepository surveyRepo;

    @Autowired
    private SurveyMapper surveyMapper;

    @Override
    public SurveyDto createSurvey(Set<CourseDto> courses) {

        Set<ReviewEntity> emptyReviews = new HashSet<>();
        String studentName = "";
        for(CourseDto course : courses){
            if("".equals(studentName)) studentName = course.getStudentName();
            emptyReviews.add(reviewMapper.toReview(reviewService.createEmptyReview(course.getTitle())));
            emptyReviews.add(reviewMapper.toReview(reviewService.createEmptyReview(course.getProfessorName())));
            for(String asistantName : course.getAssistantNames()){
                emptyReviews.add(reviewMapper.toReview(reviewService.createEmptyReview(asistantName)));
            }
        }

        SurveyEntity emptySurvey = SurveyEntity.Builder.builder().withReviews(emptyReviews).withStudentName(studentName).build();
        return  surveyMapper.toSurveyDto(surveyRepo.save(emptySurvey));
    }

    @Override
    public SurveyDto findById(Integer id) {
        return surveyMapper.toSurveyDto(surveyRepo.findById(id).get());
    }
}
