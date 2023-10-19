package com.agent47.springdatajpafirst.repository;

import com.agent47.springdatajpafirst.entity.Teacher;
import com.agent47.springdatajpafirst.entity.Course;
import com.agent47.springdatajpafirst.entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;
import java.util.List;

@SpringBootTest
class TeacherRepositoryTest{
    @Autowired
    private TeacherRepository teacherRepository;


    @Test
    public void saveTeacherWithCourseAndMaterial() {
        // Create a Teacher
        Teacher teacher = Teacher.builder()
                .firstName("Saint")
                .lastName("John")
                .build();

        // Create a CourseMaterial
        CourseMaterial material = CourseMaterial.builder()
                .url("https://example.com/material")
                .build();

        // Create a Course and associate it with the CourseMaterial
        Course course = Course.builder()
                .title("Math")
                .credit(3)
                .courseMaterial(material)
                .teacher(teacher) // Set the teacher
                .build();

        // Set the Course for the CourseMaterial
        material.setCourse(course);

        // Save the Teacher (which cascades to Course and CourseMaterial)
        teacherRepository.save(teacher);
    }

}