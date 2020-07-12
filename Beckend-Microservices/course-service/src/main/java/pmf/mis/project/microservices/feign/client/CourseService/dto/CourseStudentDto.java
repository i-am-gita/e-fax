package pmf.mis.project.microservices.feign.client.CourseService.dto;

import lombok.*;
import pmf.mis.project.microservices.feign.client.CourseService.model.UserEntity;

import javax.jws.soap.SOAPBinding;
import java.util.List;
import java.util.Set;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CourseStudentDto {

    private Integer id;
    private String title;
    private Integer espb;
    private String enrollmentPassword;
    private String description;
    private UserEntity professor;
    private Set<UserEntity> assistants;

}
