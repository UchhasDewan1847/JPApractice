package com.agent47.springdatajpafirst.repository;

import com.agent47.springdatajpafirst.entity.Course;
import com.agent47.springdatajpafirst.entity.CourseMaterial;
import com.agent47.springdatajpafirst.entity.Student;
import com.agent47.springdatajpafirst.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CourseRepositoryTest {
    @Autowired
    private CourseRepository courseRepository;
//    @Test
//    public void saveCourse(){
//        Teacher teacher= Teacher.builder()
//                .firstName("Muhammad")
//                .lastName("Hijab")
//                .build();
//        CourseMaterial courseMaterial2=CourseMaterial.builder()
//                .url("www.CSE.com")
//                .build();
//        Course course2= Course.builder()
//                .title("CSE-345")
//                .credit(3)
//                .teacher(teacher)
//                .courseMaterial(courseMaterial2)
//                .build();
//        courseRepository.save(course2);
//
//    }
@Test
public void saveCourseWithStudentAndTeacher() {

    Teacher teacher = Teacher.builder()
            .firstName("Lizze")
            .lastName("Morgan")
            .build();

    Student student = Student.builder()
            .firstName("Abhishek")
            .lastName("Singh")
            .email("abhishek@gmail.com")
            .build();

    Course course = Course
            .builder()
            .title("AI")
            .credit(12)
            .teacher(teacher)
            .build();

    course.addStudents(student);

    courseRepository.save(course);
}

}