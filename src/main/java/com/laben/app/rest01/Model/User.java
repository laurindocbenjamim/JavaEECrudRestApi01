package com.laben.app.rest01.Model;

import javax.persistence.*;

@Entity
@Table(name = "templates/user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "firstname", length = 100, nullable = false)
    private String firstname;

    @Column(name = "lastname", length = 50, nullable = false)
    private String lastname;

    @Column(name = "age", length = 4)
    private int age;

    @Column(name = "occupation", length = 255)
    private String occupation;

    @Column(name = "password", length = 255, nullable = false)
    private String password;

    public User(){}

    public User(long id, String firstname, String lastname,
                int age, String occupation){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.occupation = occupation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password){
        this.password = password;
    }

}
