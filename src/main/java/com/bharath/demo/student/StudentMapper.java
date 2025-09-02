package com.bharath.demo.student;

import com.bharath.demo.school.School;
import org.springframework.stereotype.Service;

@Service
public class StudentMapper {
	public Student toStudent(StudentDto dto) {
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

	public StudentResponseDto toResponseDto(Student student) {
		return new StudentResponseDto(
				student.getFirstName(),
				student.getLastName(),
				student.getEmail());
	}

}
