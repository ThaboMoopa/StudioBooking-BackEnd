package com.studiobookingsheet.controller;

import com.studiobookingsheet.domain.User;
import com.studiobookingsheet.factory.UserFactory;
import com.studiobookingsheet.services.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * Created by thabomoopa on 2017/11/16.
 */

@Controller
@RequestMapping(path = "/user")
public class UserController {

    private User user;

    @Autowired
    UserServiceImpl userService;

    @CrossOrigin
    @GetMapping(path = "/addUser")
    public @ResponseBody
    User create(@RequestParam String email,@RequestParam String password,@RequestParam String name)
    {
        user = UserFactory.getUser(email, password, name);
        return userService.create(user);
    }

    @CrossOrigin
    @GetMapping(path = "/findAll")
    public @ResponseBody Iterable<User> findAll()
    {
        return userService.findAll();
    }

    @CrossOrigin
    @GetMapping(path="/login")
    public @ResponseBody User findByEmailAndPassword(@RequestParam String email, @RequestParam String password)
    {
        return userService.findByEmailAndPassword(email, password);
    }
    @CrossOrigin
    @GetMapping(path="/findByEmail")
    public @ResponseBody User findByEmailIgnoreCase(@RequestParam String email)
    {
        return userService.findByEmailIgnoreCase(email);
    }
    @CrossOrigin
    @GetMapping(path="/findByPassword")
    public @ResponseBody User findByPassword(@RequestParam String password)
    {
        return userService.findByPassword(password);
    }
}
