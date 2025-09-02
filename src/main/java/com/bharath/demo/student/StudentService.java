package com.bharath.demo.student;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
	private final StudentMapper mapper;
	private final StudentRepository repository;

	public StudentService(StudentRepository repository, StudentMapper mapper) {
		this.mapper = mapper;
		this.repository = repository;
	}

	public StudentResponseDto saveStudent(StudentDto dto) {
		var student = mapper.toStudent(dto);
		var savedStudent = repository.save(student);
		return mapper.toResponseDto(savedStudent);
	}

	public StudentResponseDto findStudentById(Integer id) {
		return repository.findById(id)
						 .map(mapper::toResponseDto)
						 .orElse(null);
	}

	public List<StudentResponseDto> findAllStudents() {
		return repository.findAll().stream().map(mapper::toResponseDto).toList();
	}

	public void deleteStudent(Integer id) {
		repository.deleteById(id);
	}

	public List<StudentResponseDto> findStudent(String firstName) {
		return repository.findAllByFirstNameContaining(firstName).stream().map(mapper::toResponseDto).toList();
	}
}
