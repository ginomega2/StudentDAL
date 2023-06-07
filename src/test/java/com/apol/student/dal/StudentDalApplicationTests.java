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
        student=new Student();
        student.setCurso("javascript");student.setMensualidad(222);student.setName("lupe");
        repository.save(student);
        student=new Student();
        student.setCurso("windows 11");student.setMensualidad(444);student.setName("lola");
        repository.save(student);
        student=new Student();
        student.setCurso("linux");student.setMensualidad(555);student.setName("manuel");
        repository.save(student);
        student=new Student();
        student.setCurso("react native");student.setMensualidad(666);student.setName("lucy fernandez");

        repository.save(student);
    }

    @Test
    void testReadStudent(){
        Student student = repository.findById(1l).get();
        System.out.println(student);
         student = repository.findById(2l).get();
        System.out.println(student);
        student = repository.findById(3l).get();
        System.out.println(student);
        student = repository.findById(4l).get();
        System.out.println(student);
        student = repository.findById(5l).get();
        System.out.println(student);
        student = repository.findById(6l).get();
        System.out.println(student);
    }

    @Test
    void testUpdateStudent(){
        Student student = repository.findById(2l).get();
        System.out.println("registro de Estudiante por a actualizar  "+student);
        System.out.println(student);
        student.setName("1 nombre cambiado");
        student.setMensualidad(888);
        System.out.println("nuevos datos a escribir" + student);
        repository.save(student);


    }

    @Test
    void testDeleteStudent(){
        Student student = repository.findById(2l).get();
        System.out.println("registro de Estudiante que sera borrado "+student);
        repository.delete(student);


    }

}
