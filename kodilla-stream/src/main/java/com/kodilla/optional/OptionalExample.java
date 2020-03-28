package com.kodilla.optional;

import com.kodilla.stream.User;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        //User user = new User("user1", 30, 100, "Test");
        User user = null;

        Optional<User> optionalUser = Optional.ofNullable(user);

        String userName = optionalUser.orElse(new User("", 0, 0, "")).getUserName();

        System.out.println(userName);

        User user1 = new User("user1", 30, 100, "Test" );

        Optional<User> optionalUser1 = Optional.ofNullable(user1);
        optionalUser1.ifPresent(u -> System.out.println(u.getUserName()));


    }
}
