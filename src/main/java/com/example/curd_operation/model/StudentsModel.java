package com.example.curd_operation.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentsModel {

    @JsonProperty
    private Integer studentId;

    @JsonProperty
    private String studentsName;

    @JsonProperty
    private String mobile;

    @JsonProperty
    private String email;

    @JsonProperty
    private String password;

}
