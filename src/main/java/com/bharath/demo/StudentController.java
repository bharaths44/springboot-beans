package com.bharath.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    @GetMapping("/students/{id}")
    public StudentResponseDto findStudentById(@PathVariable Integer id) {
        return this.studentService.findStudentById(id);
    }

    @GetMapping("/students")
    public List<StudentResponseDto> findAllStudents() {
        return this.studentService.findAllStudents();
    }

    @PostMapping("/students")
    public StudentResponseDto saveStudent(@RequestBody StudentDto dto) {
        return this.studentService.saveStudent(dto);
    }

    @GetMapping("/students/search/{name}")
    public List<StudentResponseDto> findStudentsByName(@PathVariable("name") String firstName) {
        return this.studentService.findStudent(firstName);
    }

    @DeleteMapping("/students/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable Integer id) {
        this.studentService.deleteStudent(id);
    }

}
