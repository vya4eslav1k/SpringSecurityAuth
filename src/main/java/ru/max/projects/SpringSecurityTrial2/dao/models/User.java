package ru.max.projects.SpringSecurityTrial2.dao.models;


import jakarta.persistence.*;

@Entity
@Table(name = "user", schema = "mydbtest")
public class User {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    public int id;
    @Column(name = "login", length = 20, nullable = false)
    public String Login;
    @Column(name = "password", length = 20, nullable = false)
    public String Password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }
}
