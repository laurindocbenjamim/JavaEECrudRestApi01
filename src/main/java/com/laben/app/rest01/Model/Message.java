package com.laben.app.rest01.Model;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "messages")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name", length = 100, nullable = false)
    private String name;

    @Column(name = "email", length = 200, nullable = false)
    private String email;

    @Column(name = "subject", length = 100)
    private String subject;

    @Column(name =  "message", length = 300, nullable = false)
    @Type(type = "text")
    private String message;

    public Message(){

    }

    public Message(long id, String name, String email,
                   String subject, String message){
        this.id = id;
        this.name = name;
        this.email = email;
        this.subject = subject;
        this.message = message;
    }

    public long getId(){
        return this.id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getSubject(){
        return this.subject;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    public String getMessage(){
        return this.message;
    }

    public void setMessage(String message){
        this.message = message;
    }



}
