package mum.edu.cs544.student.springbatch1.repository;

import mum.edu.cs544.student.springbatch1.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
