package com.laben.app.rest01.Controller;

import com.laben.app.rest01.Model.User;
import com.laben.app.rest01.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*") /* This annotation grants access to all requests methhods*/
@RequestMapping("user")
public class ApiUserController {

    @Autowired
    private UserRepo userRepo;

    @GetMapping(value = "/us")
    public List<User> getUsers(){
        return userRepo.findAll();
    }

    @PostMapping(value = "/save")
    public String saveUser(@RequestBody User u){
        userRepo.save(u);
        return "User saved!";
    }

    @PutMapping(value = "/update/{id}")
    public String updateUser(@PathVariable long id, @RequestBody User u){
        User update = userRepo.findById(id).get();

        update.setFirstname(u.getFirstname());
        update.setLastname(u.getLastname());
        update.setAge(u.getAge());
        update.setOccupation(u.getOccupation());
        userRepo.save(update);
        return "User data updated successfull!";
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteUser(@PathVariable long id){
        User delete = userRepo.findById(id).get();
        userRepo.delete(delete);
        return "User deleted successfull!";
    }

}
