package com.agent47.springdatajpafirst.repository;

import com.agent47.springdatajpafirst.entity.Course;
import com.agent47.springdatajpafirst.entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.JpaRepository;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CourseMaterialRepositoryTest {
    @Autowired
    private CourseMaterialRepository courseMaterialRepository;
    @Test
    public void saveMaterial(){
        Course course= Course.builder()
                .title("CSE")
                .credit(3)
                .build();
        CourseMaterial courseMaterial= CourseMaterial.builder()
                .url("Gooogle.com")
                .course(course)
                .build();
        courseMaterialRepository.save(courseMaterial);
    }

}