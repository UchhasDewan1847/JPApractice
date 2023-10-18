package com.agent47.springdatajpafirst.repository;

import com.agent47.springdatajpafirst.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
