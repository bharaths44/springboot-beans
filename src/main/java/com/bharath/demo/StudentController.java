package com.bharath.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private final StudentRepository repository;

    public StudentController(StudentRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    @GetMapping("/students/{id}")
    public Student findStudentById(@PathVariable Integer id) {
        return repository.findById(id).orElse(new Student());
    }

    @GetMapping("/students")
    public List<Student> findAllStudents() {
        return repository.findAll();
    }

    private Student toStudent(StudentDto dto) {
        var student = new Student();
        student.setFirstName(dto.firstName());
        student.setLastName(dto.lastName());
        student.setEmail(dto.email());

        var school = new School();
        school.setId(dto.schoolId());
        school.setId(dto.schoolId());

        student.setSchool(school);
        return student;
    }

    private StudentResponseDto toResponseDto(Student student) {
        return new StudentResponseDto(
                student.getFirstName(),
                student.getLastName(),
                student.getEmail());
    }

    @PostMapping("/students")
    public StudentResponseDto post(@RequestBody StudentDto dto) {
        var student = toStudent(dto);
        var savedStudent = repository.save(student);
        return toResponseDto(savedStudent);
    }

    @GetMapping("/students/search/{name}")
    public List<Student> findStudentsByName(@PathVariable("name") String firstName) {
        return repository.findAllByFirstNameContaining(firstName);
    }

    @DeleteMapping("/students/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable Integer id) {
        repository.deleteById(id);
    }

}
