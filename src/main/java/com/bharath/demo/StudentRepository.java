package com.bharath.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// JpaRepository<T,ID> T-Entity class,ID-Primary key type
public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findAllByFirstNameContaining(String firstName);

}
