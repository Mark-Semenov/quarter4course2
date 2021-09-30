package ru.gb.springdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.springdemo.entities.Student;
import ru.gb.springdemo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByLogin(String login);

}
