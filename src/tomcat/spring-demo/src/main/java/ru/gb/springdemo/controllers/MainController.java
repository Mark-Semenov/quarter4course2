package ru.gb.springdemo.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.gb.springdemo.entities.Student;
import ru.gb.springdemo.services.StudentService;

@Controller
@RequiredArgsConstructor
@RequestMapping("/")
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

    @GetMapping("/student")
    public String updateStudents(Model model, @RequestParam(required = false, defaultValue = "", name = "id") Long id) {
        Student student;
        if (id != null) {
            student = studentService.findStudentById(id);
        } else student = new Student();
        model.addAttribute("stud", student);
        return "update";
    }

    @PostMapping("/update")
    public String update(Student student) {
        studentService.saveOrUpdate(student);
        return "redirect:/";
    }


    @PostMapping("/add")
    public String addStudent(Student student) {
        studentService.saveOrUpdate(student);
        return "redirect:/";
    }


}
