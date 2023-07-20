package com.laben.app.rest01.Controller;

import com.laben.app.rest01.Model.User;
import com.laben.app.rest01.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiControllers {

    @Autowired
    private UserRepo userRepo;

    @GetMapping(value = "/")
    public String index(){

        return "Welcome to my Api!";
    }

    @GetMapping(value = "/user-list")
    public List<User> getUsers(){
        return userRepo.findAll();
    }


}
