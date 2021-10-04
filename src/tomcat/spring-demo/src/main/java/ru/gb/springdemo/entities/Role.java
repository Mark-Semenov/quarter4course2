package ru.gb.springdemo.entities;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "roles")
@Data
public class Role implements GrantedAuthority {

    @Id
    private Long id;
    private String name;

    @ManyToMany
    @JoinTable(
            name = "user_role",
            joinColumns = @JoinColumn(name = "role_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private List<User> user;

    @Override
    public String getAuthority() {
        return name;
    }
}
