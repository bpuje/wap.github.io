package mum.edu.cs544.student.springbatch1.service;

import mum.edu.cs544.student.springbatch1.model.Student;

import java.util.List;

public interface StudentService {

    Student saveStudent(Student student);
    List<Student> findAll();

    //Student findByFirstNameAndLastName(Student student);
}
