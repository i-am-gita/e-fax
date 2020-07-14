package pmf.it.mis.project.app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pmf.it.mis.project.app.dto.CourseStudentDto;
import pmf.it.mis.project.app.dto.GradeDto;
import pmf.it.mis.project.app.service.GradeService;

import java.util.Set;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping(value = "")
public class GradeController {

    @Autowired
    private GradeService gradeService;

    @GetMapping(path = "/profesor/kurs/ocene/{idKurs}", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Set<GradeDto>> getGradesForCourse(@PathVariable final Integer idKurs){
        final Set<GradeDto> gradeDtos = gradeService.findGradesForCourseId(idKurs);

        return new ResponseEntity<>(gradeDtos, HttpStatus.OK);
    }

    @PostMapping(path = "/profesor/kurs/ocena/nova")
    public ResponseEntity<GradeDto> save(@RequestBody final GradeDto gradeDto){
        final GradeDto response = gradeService.save(gradeDto);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping(path = "/profesor/kurs/ocena/brisi/{idGrade}")
    public ResponseEntity<String> deleteGrade(@PathVariable final Integer idGrade) {
        gradeService.deleteById(idGrade);
        return new ResponseEntity<>("Ocena sa ID-em: " + idGrade + " je obrisana!", HttpStatus.OK);
    }

}
