package mum.edu.cs544.student.springbatch1.batch;


import mum.edu.cs544.student.springbatch1.model.Student;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import java.time.LocalDate;

public class StudentBatch implements FieldSetMapper<Student> {

    @Override
    public Student mapFieldSet(FieldSet fs) throws BindException {

        if(fs == null){
            return null;
        }

        Student student = new Student();
        student.setId(fs.readInt("id"));
        student.setFirstName(fs.readString("firstName"));
        student.setLastName(fs.readRawString("lastName"));
        student.setMajor(fs.readString("major"));
        student.setGPA(fs.readDouble("GPA"));
        student.setDateOfBirth(LocalDate.of(LocalDate.now().getYear() - fs.readInt("age"), 1,1));

        System.out.println(String.format("Converted from age [%d] to [%s] to date of birth: ", fs.readInt("age"), student.getDateOfBirth().toString()));

        return student;
    }
}
