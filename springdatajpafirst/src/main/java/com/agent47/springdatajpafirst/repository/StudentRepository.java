package com.agent47.springdatajpafirst.repository;

import com.agent47.springdatajpafirst.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository <Student,Long>{
    public List<Student> findByLastNameContaining(String lastName);
}
