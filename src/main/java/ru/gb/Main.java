package ru.gb;

import ru.gb.Service.StudentService;
import ru.gb.entities.Student;

import java.util.List;

public class Main {

    public static StudentService studentService;

    public static void main(String[] args) {
        studentService = new StudentService();
        studentService.saveOrUpdate(new Student("Kate", 8));
        studentService.delete(studentService.findById(26L));
        Student student = studentService.findById(1L);
        System.out.println(student.getName() + ": " + student.getMark());
        student.setMark(8);
        System.out.println(studentService.findById(1L));
        List<Student> students = studentService.findAll();
        students.forEach(System.out::println);
        studentService.closeSession();

    }
}
