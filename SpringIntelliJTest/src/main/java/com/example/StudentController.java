package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/studentController")
public class StudentController {
    @RequestMapping("/showStudentForm")
    public  String showForm(Model theModel){
        // create a student object
        Student theStudent = new Student();
        // add student object to the model
        theModel.addAttribute("student", theStudent);

        return "student-form";
    }
    @RequestMapping("/processForm3")
    public String processForm(@ModelAttribute("student") Student theStudent){

        System.out.println("Student: " + theStudent.getFirstName());
        return "student-confirmation";
    }
}
