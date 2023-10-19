package com.agent47.springdatajpafirst.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Teacher {
    @Id
    @SequenceGenerator(
            name = "teacher_id",
            sequenceName = "teacher_id",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "teacher_id",
            strategy = GenerationType.SEQUENCE
    )
    private Long teacherId;
    private String firstName;
    private String lastName;

}
