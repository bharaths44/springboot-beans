package com.bharath.demo.student;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class StudentMapperTest {

	@BeforeEach
	void setUp() {
		System.out.println("Starting TestMethod");
	}

	@AfterEach
	void tearDown() {
		System.out.println("Finished TestMethod");
	}

	@BeforeAll
	static void beforeAll() {
		System.out.println("Before All Test");
	}

	@AfterAll
	static void afterAll() {
		System.out.println("After All Test");
	}

	@Test
	public void testMethod1() {
		System.out.println("Testing Method 1");

	}

}