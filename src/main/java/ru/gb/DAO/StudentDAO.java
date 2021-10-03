package ru.gb.DAO;

import ru.gb.entities.Student;

import java.util.List;


public interface StudentDAO {

    boolean delete(Student student);

    void saveOrUpdate(Student student);

    Student findById(Long id);

    void removeById(Long id);

    List<Student> findAll();

}
