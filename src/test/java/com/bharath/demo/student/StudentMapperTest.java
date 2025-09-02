package com.bharath.demo.student;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class StudentMapperTest {

	private StudentMapper mapper;

	@BeforeAll
	static void beforeAll() {
		System.out.println("Before All Test");
	}

	@AfterAll
	static void afterAll() {
		System.out.println("After All Test");
	}

	@BeforeEach
	void setUp() {
		System.out.println("Starting TestMethod");
		mapper = new StudentMapper();
	}

	@AfterEach
	void tearDown() {
		System.out.println("Finished TestMethod");
	}

	@Test
	public void shouldMapStudentDtoToStudent() {
		StudentDto dto = new StudentDto("John",
										"Doe",
										"john@mail.com",
										1);
		Student student = mapper.toStudent(dto);
		assertEquals(dto.firstName(), student.getFirstName());
		assertEquals(dto.lastName(), student.getLastName());
		assertEquals(dto.email(), student.getEmail());
		assertEquals(dto.schoolId(), student.getSchool().getId());
		assertNotNull(student.getSchool());

	}
	@Test
	public void shouldThrowNullPointerExceptionWhenStudentDtoIsNull() {
		var msg=assertThrows(NullPointerException.class, () -> mapper.toStudent(null));
		assertEquals("dto is null",msg.getMessage());
	}

	@Test
	public void shouldMapStudentToStudentResponseDto() {
		Student student = new Student("Bharath",
									  "S",
									  "bharathsatheesan@gmail.com",
									  21);
		StudentResponseDto dto = mapper.toResponseDto(student);
		assertEquals(student.getFirstName(), dto.firstName());
		assertEquals(student.getLastName(), dto.lastName());
		assertEquals(student.getEmail(), dto.email());

	}


}