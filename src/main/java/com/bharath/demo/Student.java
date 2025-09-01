package com.bharath.demo;

import jakarta.persistence.*;

@Entity
// @Table(name = "students") give different table name
public class Student {
    @Id
    @GeneratedValue // auto generate id
    private Integer id;

    // @Column(name = "first_name",length=20) give different column name,give
    // specific length
    private String firstName;

    private String lastName;

    // @Column(unique = true,updatable=false,insertable) // email should be
    // unique,not updatable,not insertable
    private String email;

    private int age;

    @ManyToOne()
    @JoinColumn(name = "school_id") // foreign key column in Student table
    private School school;

    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL) // one-to-one relationship with StudentProfile
    private StudentProfile studentProfile;

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public StudentProfile getStudentProfile() {
        return studentProfile;
    }

    public void setStudentProfile(StudentProfile studentProfile) {
        this.studentProfile = studentProfile;
    }


    public Student() {
    }

    public Student(String firstName, String lastName, String email, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
