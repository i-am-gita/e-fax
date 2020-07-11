package pmf.it.mis.project.app.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping("/all")
    public String allAccess() {
        return "Public Content.";
    }

    @GetMapping("/student")
    @PreAuthorize("hasRole('STUDENT') or hasRole('ASSISTANT') or hasRole('PROFESSOR') or hasRole('ADMIN')")
    public String studentAccess() {
        return "Student Content.";
    }

    @GetMapping("/assistant")
    @PreAuthorize("hasRole('STUDENT') or hasRole('ASSISTANT') or hasRole('PROFESSOR')")
    public String assistantAccess() {
        return "Assistant Board.";
    }

    @GetMapping("/professor")
    @PreAuthorize("hasRole('STUDENT') or hasRole('ASSISTANT') or hasRole('PROFESSOR')")
    public String professorAccess() {
        return "Professor Board.";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminAccess() {
        return "Admin Board.";
    }
}