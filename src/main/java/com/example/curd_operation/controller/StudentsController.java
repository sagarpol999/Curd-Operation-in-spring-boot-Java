package com.example.curd_operation.controller;

import com.example.curd_operation.entity.Students;
import com.example.curd_operation.model.StudentsModel;
import com.example.curd_operation.service.StudentsService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j2
@RestController
public class StudentsController {

    @Autowired
    StudentsService studentsService;

/*
Signup api Insert the data
*/
    @PostMapping("/addStudents")
    public String addStudents(@RequestBody StudentsModel studentsModel) {
    log.info("signup api called");
    return studentsService.addStudents(studentsModel);

}


/*
getAllstudents list to Get the data
*/


    @GetMapping("/getAllStudentsList")
    public List<Students> getAllStudentsList(){
        log.info("getAllStudentsList API called");
    return studentsService.getAllStudentsList();
    }

/*
Delete Student to delete the data
*/

    @DeleteMapping("/deleteStudents/{studentId}")
    public String deleteStudents(@PathVariable("studentId") Integer studentId){
        log.info("deleteStudents API called");
    return studentsService.deleteStudentById(studentId);
    }


/*
update student to update the data here {We can also use Post mapping}
*/
    @PutMapping("/updateStudents")
    public String updateStudents(@RequestBody StudentsModel studentsModel,@RequestParam("studentId") Integer studentId){
        log.info("updateStudents API called");
        return studentsService.updateStudent(studentsModel,studentId);

}



}
