package mum.edu.cs544.student.springbatch1.service;

import mum.edu.cs544.student.springbatch1.model.Student;
import mum.edu.cs544.student.springbatch1.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

//    @Override
//    public Student findByFirstNameAndLastName(Student student) {
//        return null;
//    }

}
