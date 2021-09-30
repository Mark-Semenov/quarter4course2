package ru.gb.springdemo.services;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.gb.springdemo.entities.Student;
import ru.gb.springdemo.repositories.StudentRepository;

import java.util.List;

@Component
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    @Transactional
    public void removeStudent(Long id) {
        studentRepository.deleteById(id);
    }


    @Transactional
    public void saveOrUpdate(Student student) {
        studentRepository.save(student);
    }


    public Student findStudent(Student student) {
        return studentRepository.findById(student.getId()).orElse(null);
    }


    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }


}
