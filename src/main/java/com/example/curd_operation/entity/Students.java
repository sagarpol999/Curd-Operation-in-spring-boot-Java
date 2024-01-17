package com.example.curd_operation.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "studentId", updatable = false, nullable = false)
    @JsonProperty
    private Integer studentId;

    @Column(name = "studentsName")
    @JsonProperty
    private String studentsName;

    @Column(name = "mobile")
    @JsonProperty
    private String mobile;

    @Column(name = "email")
    @JsonProperty
    private String email;

    @Column(name = "password")
    @JsonProperty
    private String password;
}
