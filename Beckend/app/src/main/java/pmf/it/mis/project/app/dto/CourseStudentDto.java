package pmf.it.mis.project.app.dto;

import lombok.*;

import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CourseStudentDto {

    private String title;
    private Integer espb;
    private String description;
    private String professorName;
    private List<String> assistantNames;

}
