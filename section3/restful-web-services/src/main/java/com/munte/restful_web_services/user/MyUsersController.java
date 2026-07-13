package com.munte.restful_web_services.user;

import com.munte.restful_web_services.exceptions.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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
        MyUser user = service.findOne(myUserId);

        if(user==null)
        {
            throw new UserNotFoundException("id:" + myUserId);
        }

        return user;
    }

    @PostMapping()
    public ResponseEntity<MyUser> createUser(@RequestBody MyUser newUser) {
        MyUser savedUser = service.createNewUser(newUser);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }
}
