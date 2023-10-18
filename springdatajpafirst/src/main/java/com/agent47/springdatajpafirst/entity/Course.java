package com.agent47.springdatajpafirst.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(
        name = "course_tb"
)
public class Course {
    @Id
    @SequenceGenerator(
            name = "course_id",
            sequenceName = "course_id",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "course_id")
    private Long courseId;
    private String title;
    private Integer credit;
}
