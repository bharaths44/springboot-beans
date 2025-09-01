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

    @PostMapping("/students")
    public Student post(@RequestBody Student student){
        return repository.save(student);
    }

    @GetMapping("/students/search/{name}")
    public List<Student> findStudentsByName(@PathVariable("name") String firstName) {
        return repository.findAllByFirstNameContaining(firstName);
    }

    @DeleteMapping("/students/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable Integer id){
        repository.deleteById(id);
    }



}
