package com.apol.student.dal;

import com.apol.student.dal.entities.Student;
import com.apol.student.dal.repos.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentDalApplicationTests {

    @Autowired
    StudentRepository repository;

    @Test
    void testCreateStudent() {
        Student student = new Student();
        student.setCurso("c#");student.setMensualidad(111);student.setName("pepe");
        repository.save(student);
        student=new Student();
        student.setCurso("java");student.setMensualidad(333);student.setName("krsi");
        repository.save(student);
    }

}
