package ru.gb.springdemo.services;

import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.gb.springdemo.entities.User;
import ru.gb.springdemo.repositories.UserRepository;

import java.util.List;

@Component
@AllArgsConstructor
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;

    @Transactional
    public void removeUser(User user) {
        userRepository.delete(user);
    }


    @Transactional
    public void saveOrUpdate(User user) {
        userRepository.save(user);
    }


    public User findUser(User user) {
        return userRepository.findById(user.getId()).orElse(null);
    }


    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User findByName(String name) {
        return userRepository.findByLogin(name);
    }

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        User user = findByName(login);
        return new org.springframework.security.core.userdetails.User(user.getLogin(), user.getPassword(), user.getRoles());
    }
}
