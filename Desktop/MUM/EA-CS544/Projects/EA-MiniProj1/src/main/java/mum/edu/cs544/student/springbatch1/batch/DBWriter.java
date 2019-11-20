package mum.edu.cs544.student.springbatch1.batch;

import mum.edu.cs544.student.springbatch1.model.Student;
import mum.edu.cs544.student.springbatch1.repository.StudentRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBWriter implements ItemWriter<Student>{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void write(List<? extends Student> students) throws Exception {

        System.out.println("Data saved for Students info" + students);
        studentRepository.saveAll(students);

    }
}
