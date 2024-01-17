package com.example.curd_operation.service.impl;

import com.example.curd_operation.entity.Students;
import com.example.curd_operation.exceptions.RecordNotFoundException;
import com.example.curd_operation.model.StudentsModel;
import com.example.curd_operation.repository.StudentsRepository;
import com.example.curd_operation.service.StudentsService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class StudentsServiceImpl implements StudentsService {

    @Autowired
    StudentsRepository studentsRepository;

    @Override
    public String addStudents(StudentsModel studentsModel){
        log.info("addStudents Service called");
        Students students= new Students();
        students.setStudentsName(studentsModel.getStudentsName());
        students.setEmail(studentsModel.getEmail());
        students.setMobile(studentsModel.getMobile());
        students.setPassword(studentsModel.getPassword());
        studentsRepository.save(students);
        return "Student Added Succesfully";
    }

    @Override
   public List<Students> getAllStudentsList(){
        log.info("getAllStudentsList Service called");
        return(List<Students>) studentsRepository.findAll();
    }

    @Override
    public String deleteStudentById(Integer studentsId){
        log.info("deleteStudent Service called");
        studentsRepository.deleteById(studentsId);
        return "Student Deleted Successfully";
    }


    @Override
    public String updateStudent( StudentsModel studentsModel, Integer studentId){
        log.info("updateStudent Service called");
        Students students= studentsRepository.findById(studentId)
                        .orElseThrow(() -> new RecordNotFoundException("Employee not found."));

        students.setPassword(studentsModel.getPassword());
        students.setStudentsName(studentsModel.getStudentsName());
        students.setMobile(studentsModel.getMobile());
        students.setEmail(studentsModel.getEmail());
        studentsRepository.save(students);
        return "Student Updated Successfully";
    }



}
