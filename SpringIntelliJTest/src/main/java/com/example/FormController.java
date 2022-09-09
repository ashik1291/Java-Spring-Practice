package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/formControllers")
public class FormController {

    // need a controller method to show the initial form
    @RequestMapping("/showForm")
    public String showForm(){
        return "nameForm";
    }
    // need a controller method to process the HTML Form
    @RequestMapping("/processForm")
    public String processform(){
        return "showName";
    }

    // add data to the model
    @RequestMapping("/processForm2")
    public String letsShoutDude(HttpServletRequest request, ModelMap model){
        // read request parameter from the HTML form
        String name = request.getParameter("studentName");
        //convert the data to uppercase
        name = name.toUpperCase();
        // create the message
        String result = "Yo! " + name;
        // add message to the model
        model.addAttribute("message", result);
        return "showName";
    }

    @RequestMapping("/processForm3")
    public String processForm3(@RequestParam("studentName") String theName, ModelMap model){
        //convert the data to uppercase
        theName = theName.toUpperCase();
        // create the message
        String result = "Hey! " + theName;
        // add message to the model
        model.addAttribute("message", result);
        return "showName";
    }

}
