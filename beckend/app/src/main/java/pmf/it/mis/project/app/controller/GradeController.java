package pmf.it.mis.project.app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pmf.it.mis.project.app.dto.GradeDto;
import pmf.it.mis.project.app.dto.GradeUpdatePatch;
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
    @PreAuthorize("hasRole('ROLE_PROFESSOR')")
    public ResponseEntity<Set<GradeDto>> getGradesForCourse(@PathVariable final Integer idKurs){
        return new ResponseEntity<>(gradeService.findGradesForCourseId(idKurs), HttpStatus.OK);
    }

    @PostMapping(path = "/profesor/kurs/ocena/nova")
    @PreAuthorize("hasRole('ROLE_PROFESSOR')")
    public ResponseEntity<GradeDto> save(@RequestBody final GradeDto gradeDto){
        return new ResponseEntity<>(gradeService.save(gradeDto), HttpStatus.OK);
    }

    @DeleteMapping(path = "/profesor/kurs/ocena/brisi/{idGrade}")
    @PreAuthorize("hasRole('ROLE_PROFESSOR')")
    public ResponseEntity<String> deleteGrade(@PathVariable final Integer idGrade) {
        gradeService.deleteById(idGrade);
        return new ResponseEntity<>("Ocena sa ID-em: " + idGrade + " je obrisana!", HttpStatus.OK);
    }

    @PatchMapping(path = "/update/grade/{id}", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    @PreAuthorize("hasRole('ROLE_PROFESSOR')")
    public ResponseEntity<GradeDto> updateProfessorComment(@PathVariable final Integer id, @RequestBody final GradeUpdatePatch updateGrade){
        return new ResponseEntity<>(gradeService.updateProfessorComment(updateGrade, id), HttpStatus.OK);
    }

    @PutMapping(path = "/update", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    @PreAuthorize("hasRole('ROLE_PROFESSOR')")
    public ResponseEntity<GradeDto> updateWholeGrade(@RequestBody final GradeDto gradeDto) {
        return new ResponseEntity<>(gradeService.updateGradeWithPut(gradeDto), HttpStatus.OK);
    }

    @GetMapping(path = "/student/ocene/{idStudent}", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Set<GradeDto>> getGradesForStudent(@PathVariable final String idStudent){
        return new ResponseEntity<>(gradeService.findGradeByStudentId(idStudent),HttpStatus.OK);
    }
}
