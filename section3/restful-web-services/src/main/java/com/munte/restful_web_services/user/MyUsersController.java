package com.munte.restful_web_services.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/my-users")
public class MyUsersController {

    private final MyUserDaoService service;

    @Autowired
    public MyUsersController(MyUserDaoService service) {
        this.service = service;
    }

    @GetMapping
    public List<MyUser> getUsers() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public MyUser getUserById(@PathVariable(name = "id") Integer myUserId) {
        return service.findOne(myUserId);
    }

    @PostMapping()
    public void createUser(@RequestBody MyUser newUser) {
        service.createNewUser(newUser);
    }
}
