package com.oop.modul2tkach;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PortfolioController {

    @GetMapping("/")
    public String portfolio(Model model) {
        List<Work> works = getWorks();

        model.addAttribute("works", works);
model.addAttribute("aboutMe",getInformation());
        return "portfolio";
    }

    private List<Work> getWorks() {
        List<Work> works = new ArrayList<>();
        works.add(new Work("Hillel Course", "I have successfully completed the" +
                " Java Enterprise development course. On it, I worked with Spring MVC, Data JPA, Security." +
                " Mastered REST architecture and upgraded Backend development skills", "Hillel_Serificate1.png"));
        return works;
    }
    private AboutMe getInformation(){
        AboutMe aboutMe=  new AboutMe("My name is Dmitry Tkach." +
                " I am 19 years old, I am from Ukraine, the city of Odessa." +
                " I study at the Odessa National Polytechnic University. I have been programming" +
                " in Java for over a year. During this time, I completed several courses," +
                " the certificates of which are shown below. I am fond of football, guitar and" +
                " lead an active lifestyle","I started studying programming in 2021. During this time I learned Java\n" +
                ", Spring, tightened English. Now I am getting ready for work - I am\n" +
                "improving my skills and doing pet-projects");
        return aboutMe;
    }
}
