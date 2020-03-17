package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsersManager {
    public static void main(String[] args) {
       // UsersRepository.getUsersList() // wywołanie metody
        List<String> userNames = UsersRepository.getUsersList() // gdy chcemy wynik zapisac do listy
                .stream() // uruchomienie strumienia przez który przepłuwają obiekty typu User
                .filter(u -> u.getGroup().equals("Chemists"))
                //.map(u -> u.getUserName()) // operacja transformująca za pomocą metody map; argumentem metody jest wyrażenie lambda
                .map(UsersManager :: getUsersName) //referencja do metody którą mamy zamiast lambdy
                //.forEach(un -> System.out.println(un)); // kolektor kończy stream
                .collect(Collectors.toList());  // metoda collect z kolektorem, który utowrzy listę
        System.out.println(userNames);
    }
    public static String getUsersName(User user) {
        return user.getUserName();
    }
}
