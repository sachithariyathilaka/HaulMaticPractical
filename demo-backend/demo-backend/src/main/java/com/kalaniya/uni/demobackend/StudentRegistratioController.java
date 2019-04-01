package com.kalaniya.uni.demobackend;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentRegistratioController
{
    @RequestMapping(method = RequestMethod.POST, value="/register/student")
    @ResponseBody
    public StudentRegistrationReply registerStudent(@RequestBody Student student) {
        System.out.println("In registerStudent");
        StudentRegistrationReply stdregreply = new StudentRegistrationReply();
        StudentRegistration.getInstance().add(student);
        //We are setting the below value just to reply a message back to the caller
        stdregreply.setStudentName(student.getStudentName());
        stdregreply.setStudentAge(student.getStudentAge());
        stdregreply.setStudentId(student.getStudentId());
        stdregreply.setModuleId(student.getModuleId());
        stdregreply.setModuleName(student.getModuleName());
        stdregreply.setRegistrationStatus("Successful");
        return stdregreply;
    }

}
