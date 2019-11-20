package mum.edu.cs544.student.springbatch1.batch;

import mum.edu.cs544.student.springbatch1.model.Student;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class Processor implements ItemProcessor<Student, Student> {

    private static final Map<String, String> MAJOR_NAMES = new HashMap<>();


    public Processor(){
        MAJOR_NAMES.put("001", "Computer Science");
        MAJOR_NAMES.put("002", "Business Administration");
        MAJOR_NAMES.put("003", "Vedic Science");
    }

    @Override
    public Student process(Student student) throws Exception {

//        String majorCode = student.getMajor();
//        String major = MAJOR_NAMES.get(majorCode);
//        student.setMajor(major);
//        //student.setDateOfBirth(new Date());

        //System.out.println(String.format("Converted from [%s] to [%s]", majorCode, major));
        return student;
    }
}
