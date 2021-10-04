package ru.gb.springdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.springdemo.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
