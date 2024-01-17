package com.example.curd_operation.service;

import com.example.curd_operation.entity.Students;
import com.example.curd_operation.model.StudentsModel;

import java.util.List;

public interface StudentsService {

    String addStudents(StudentsModel studentsModel);

    List<Students> getAllStudentsList();

    String deleteStudentById(Integer studentsId);

    String updateStudent(StudentsModel studentsModel,Integer studentsId);
}
