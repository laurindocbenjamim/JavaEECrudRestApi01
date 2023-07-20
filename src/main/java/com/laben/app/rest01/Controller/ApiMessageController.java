package com.laben.app.rest01.Controller;

import com.laben.app.rest01.Model.Message;
import com.laben.app.rest01.Repo.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/message")
public class ApiMessageController {

    @Autowired
    private MessageRepository messageRepository;

    @GetMapping
    public List<Message> getMessages(){
        return (List<Message>) messageRepository.findAll();
    }

    @PostMapping
    public String save(@RequestBody Message message){
        messageRepository.save(message);
        return "Message sent successfull!";
    }

    @PutMapping(value = "/update/{id}")
    public String update(@PathVariable long id, @RequestBody Message message){
        Message update = messageRepository.findById(id).get();

            update.setName(message.getName());
            update.setEmail(message.getEmail());
            update.setSubject(message.getSubject());
            update.setMessage(message.getMessage());

            messageRepository.save(update);

        return "Message updated successfull!";
    }

    @DeleteMapping(value = "{id}")
    public boolean delete(@PathVariable long id){
        Message delete = messageRepository.findById(id).get();
        messageRepository.delete(delete);
        return true;
    }

}
