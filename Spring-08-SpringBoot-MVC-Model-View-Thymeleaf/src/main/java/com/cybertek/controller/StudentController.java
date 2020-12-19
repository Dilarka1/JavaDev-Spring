package com.cybertek.controller;


import com.cybertek.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/welcome")
    public String homePage(Model model){

        model.addAttribute("name", "Ozzy");
        model.addAttribute("course", "MVC");
        model.addAttribute("name", "I miss Disneyland");

        String subject = "Collections";
        model.addAttribute("subject", subject);

        //create some student id (0-1000) and show it in UI

        String userID = "945";
        model.addAttribute("userID", userID);

        int studentID = new Random().nextInt(1000);
        model.addAttribute("id", studentID);

        List<Integer>numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(5);
        numbers.add(3);
        numbers.add(200);
        numbers.add(700);
        model.addAttribute("numbers", numbers);

        //print your birthday

        LocalDate birthday = LocalDate.now().minusYears(41);
        model.addAttribute("birthday", birthday);

        Student student = new Student(56, "Mike", "Smith");
        model.addAttribute("student", student);

        return "student/welcome";
    }

    @GetMapping("/register")
    public String homepage2(){
        return "student/register";
    }
}
