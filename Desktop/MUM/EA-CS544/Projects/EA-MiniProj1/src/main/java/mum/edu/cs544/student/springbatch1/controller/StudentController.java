package mum.edu.cs544.student.springbatch1.controller;

import mum.edu.cs544.student.springbatch1.model.Student;
import mum.edu.cs544.student.springbatch1.repository.StudentRepository;
import mum.edu.cs544.student.springbatch1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/student")
    public List<Student> getListStudent(){
        List<Student> studentList = studentService.findAll();
        System.out.println("****************"+studentList);
        return studentList;
    }

    @PostMapping("/saveStudent")
    public ResponseEntity<Student> saveNewStudent(@RequestBody Student student){
        Student persistedObject = studentService.saveStudent(student);
        return new ResponseEntity<>(persistedObject, HttpStatus.CREATED);
    }
}
