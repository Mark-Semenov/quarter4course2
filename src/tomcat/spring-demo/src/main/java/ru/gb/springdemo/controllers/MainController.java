package ru.gb.springdemo.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import ru.gb.springdemo.services.StudentService;

@Controller
@RequiredArgsConstructor
public class MainController {

    private final StudentService studentService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }


    @GetMapping("/")
    public String showStudents(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "index";
    }

    @GetMapping("/delete")
    public String deleteStudents(@RequestParam(name = "id") Long id) {
        studentService.removeStudent(id);
        return "redirect:/";
    }

}
