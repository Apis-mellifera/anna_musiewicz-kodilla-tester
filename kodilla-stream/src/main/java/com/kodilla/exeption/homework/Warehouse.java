package com.kodilla.exeption.homework;



import java.util.*;
import java.util.stream.Collectors;

public class Warehouse {

    
    private List<Order> orderCollection = new ArrayList<>();



    public void addOrder(Order order) {
        orderCollection.add(order);
    }

    public Order getOrder(String number) {
        Order order = new Order(number);
        orderCollection.stream()
                .map(Order::getNumber)
                .filter(n -> n.equals(number))
                .collect(Collectors.toCollection(HashSet::new));
        return order;
    }

    public boolean doesOrderExists(String number) throws OrderDoesntExistExeption {
        if(orderCollection.equals(number))
            return orderCollection.equals(number);
        throw new OrderDoesntExistExeption();
    }

//    public Order getOrder(String number) {
//        orderCollection.stream()
//                .filter(n-> n.getNumber().equals(number))
//                .collect(Collectors.toCollection(ArrayList::new));
//        Order order = this.orderCollection.get(Integer.parseInt(number));
//        return order;
//    }


}
