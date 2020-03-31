package com.kodilla.exeption.homework;
import java.util.*;

public class Warehouse {

    private Set<Order> orderCollection = new HashSet<>();

    public void addOrder(Order order) {
        orderCollection.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistExeption {
        return orderCollection.stream()
                .filter(n -> n.getNumber().equals(number))
                .findAny()
                .orElseThrow(OrderDoesntExistExeption::new);
    }
}
