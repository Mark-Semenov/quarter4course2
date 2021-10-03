package ru.gb.Service;

import org.hibernate.Session;
import org.hibernate.Transaction;
import ru.gb.DAO.StudentDAO;
import ru.gb.entities.Student;
import ru.gb.utils.SessionFactory;

import java.util.List;

public class StudentService implements StudentDAO {

    public Session sessionFactory = SessionFactory.getSessionFactory().openSession();

    @Override
    public boolean delete(Student student) {
        Transaction transaction = sessionFactory.beginTransaction();
        sessionFactory.delete(student);
        transaction.commit();
        return sessionFactory.contains(student);
    }

    @Override
    public void saveOrUpdate(Student student) {
        Transaction transaction = sessionFactory.beginTransaction();
        sessionFactory.saveOrUpdate(student);
        transaction.commit();
    }

    @Override
    public Student findById(Long id) {
        return sessionFactory.get(Student.class, id);
    }

    @Override
    public void removeById(Long id) {
        delete(findById(id));
    }

    @Override
    public List<Student> findAll() {
        return sessionFactory.createQuery("from Student").list();
    }

    public void closeSession() {
        sessionFactory.close();
    }
}
