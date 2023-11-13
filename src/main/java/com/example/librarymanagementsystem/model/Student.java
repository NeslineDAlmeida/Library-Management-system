package com.example.librarymanagementsystem.model;

import com.example.librarymanagementsystem.Enum.Gender;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "student_info")
public class Student {
    String name;
    int age;
    @Column(unique = true, nullable = false)
    String email;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int regNo;

@Enumerated(EnumType.STRING)
Gender gender;

@OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
    LibraryCard libraryCard;
}
