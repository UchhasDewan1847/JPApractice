package com.agent47.springdatajpafirst.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(
        name = "student_tb",
        uniqueConstraints = @UniqueConstraint(
                name = "email_id",
                columnNames = "email_id"
        )
)
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_id",
            sequenceName = "student_id",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_id"
    )
    private Long studentId;
    private String firstName;
    private String lastName;
    @Column(
            name = "email_id",
            nullable = false
    )
    private String email;
    @Embedded
    private Guardian guardian;
}
