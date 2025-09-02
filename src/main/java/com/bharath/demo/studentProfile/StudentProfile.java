package com.bharath.demo.studentProfile;

import com.bharath.demo.student.Student;
import jakarta.persistence.*;


@Entity
public class StudentProfile {
    @Id
    @GeneratedValue
    private Integer id;
    private String bio;

    @OneToOne
    @JoinColumn(name = "student_id") // foreign key column in StudentProfile table
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public StudentProfile() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
