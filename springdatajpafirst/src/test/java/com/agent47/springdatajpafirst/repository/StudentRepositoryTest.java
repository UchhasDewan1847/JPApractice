package com.agent47.springdatajpafirst.repository;

import com.agent47.springdatajpafirst.entity.Guardian;
import com.agent47.springdatajpafirst.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;
    @Test
    public void savingStudent(){
        Guardian guardian =Guardian.builder().email("jsdfh@gmail.com").name("Ujjal Kanti Dewan").mobile("01892839483").build();
        Student student= Student.builder().firstName("Bisswas").email("BTJ@gmail.com").lastName("dewan").guardian(guardian).build();
        studentRepository.save(student);
    }
    @Test
    public void getByNameContaining(){
        List<Student> students;
        students=studentRepository.findByLastNameContaining("de");
        System.out.println(students);}
}
