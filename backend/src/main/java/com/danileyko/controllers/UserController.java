package com.danileyko.controllers;

import com.danileyko.domain.User;
import com.danileyko.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userService;

    @RequestMapping(value="/user", method = RequestMethod.GET)
    public List listUser(){
        return userService.findAll();
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public User create(@RequestBody User user){
        return userService.save(user);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable(value = "id") Integer id){
        Optional<User> optionalUser = userService.findById(id);
        if (optionalUser.isPresent()) {
            userService.delete(optionalUser.get());
            return "success";
        } else {
            return "fail";
        }
    }
}
