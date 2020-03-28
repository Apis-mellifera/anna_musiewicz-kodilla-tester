package com.kodilla.exeption.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("125RT"));
        warehouse.addOrder(new Order("139RT"));
        warehouse.addOrder(new Order("147RT"));
        warehouse.addOrder(new Order("295RT"));

        warehouse.getOrder("125RT");


        try {
            boolean doesOrder456RTExists = warehouse.doesOrderExists("456RT");
            System.out.println("456RT order status: " + doesOrder456RTExists);
        } catch (OrderDoesntExistExeption e) {
            System.out.println("Sorry, this order doesn't exists");
        }
    }
}
