package com.kodilla.exeption.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("125RT"));
        warehouse.addOrder(new Order("139RT"));
        warehouse.addOrder(new Order("147RT"));
        warehouse.addOrder(new Order("295RT"));

        try {
            Order order = warehouse.getOrder("128RT");
            System.out.println("Order number" + order.getNumber() +  " is found");
        } catch (OrderDoesntExistExeption e) {
            System.out.println("Sorry, this order doesn't exist");
        }
    }
}
