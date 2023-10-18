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
        name = "course_material_tb"
)

public class CourseMaterial {
    @Id
    @SequenceGenerator(
            name = "course_material_id",
            sequenceName = "course_material_id",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "course_material_id")
    private Long courseMaterialId;
    private String url;
    @OneToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "course_id", // Name of the column in CourseMaterial table
            referencedColumnName = "courseId" // Name of the column in Course table
    )
    private Course course;


}
