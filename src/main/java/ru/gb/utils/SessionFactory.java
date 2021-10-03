package ru.gb.utils;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import ru.gb.entities.Student;

public class SessionFactory {

    public static org.hibernate.SessionFactory getSessionFactory() {
        Configuration configuration = new org.hibernate.cfg.Configuration().configure();
        configuration.addAnnotatedClass(Student.class);
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        return configuration.buildSessionFactory(builder.build());
    }


}
