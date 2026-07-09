package com.munte.restful_web_services.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class MyUserDaoService {

    private static List<MyUser> users = new ArrayList<>();
    private static int usersCount = 0;

    static {
        users.add(new MyUser(++usersCount, "Adam", LocalDate.now().minusYears(30)));
        users.add(new MyUser(++usersCount, "Alex", LocalDate.now().minusYears(25)));
        users.add(new MyUser(++usersCount, "Jim", LocalDate.now().minusYears(20)));
    }

    public List<MyUser> findAll() {
        return users;
    }

    public MyUser findOne(int id) {
        Predicate<? super MyUser> predicate = myUser -> myUser.getId().equals(id);
        return users.stream().filter(predicate).findFirst().get();
    }

    public MyUser createNewUser(MyUser newUser) {
        newUser.setId(++usersCount);
        users.add(newUser);
        return newUser;
    }
}
