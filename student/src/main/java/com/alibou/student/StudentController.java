package com.alibou.student;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService service;

//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public void save(
//            @RequestBody Student student
//    ) {
//        service.saveStudent(student);
//    }

    @GetMapping
    public String findAllStudents() {

        return "Students Works";
//                ResponseEntity.ok(service.findAllStudents()

    }

//    @GetMapping("/school/{school-id}")
//    public ResponseEntity<List<Student>> findAllStudents(
//            @PathVariable("school-id") Integer schoolId
//    ) {
//        return ResponseEntity.ok(service.findAllStudentsBySchool(schoolId));
//    }
}
