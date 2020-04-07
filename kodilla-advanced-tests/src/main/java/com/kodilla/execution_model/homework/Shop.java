package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Shop {

    Set<Order> orderSet = new HashSet<>();

    public void addOrder(Order order) {
        this.orderSet.add(order);
    }

    public int getSize() {
        return this.orderSet.size();
    }

    public Order getOrder(Order order) {
        return orderSet
                .stream()
                .filter(o -> o.equals(order))
                .collect(Collectors.toSet())
                .iterator()
                .next();
    }

    public Set<Order> findByDates(LocalDate startDate, LocalDate endDate) {
        Set<Order> result = new HashSet<>();
        for (Order order : orderSet) {
            if (order.getDate().isAfter(startDate) && order.getDate().isBefore(endDate)) {
                result.add(order);
            }
        }
        return result;
    }

    public double getSumOfOrdersValues() {
        return orderSet.stream()
                .map(Order::getValue)
                .mapToDouble(Double::doubleValue)
                .sum();
    }

    public Set<Order> getOrdersOutOfRangeOfTwoValues(double minValue, double maxValue) {
        Set<Order> result = new HashSet<>();
        for (Order order : orderSet) {
            if (order.getValue() >= minValue && order.getValue() <= maxValue) {
                result.add(order);
            }
        }
        return result;
    }
}



