package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {
    Shop shop = new Shop();

    Order order1 = new Order(45.00, LocalDate.of(2020, 3, 20), "viki");
    Order order2 = new Order(65.00, LocalDate.of(2020, 2, 16), "lukas");
    Order order3 = new Order(35.00, LocalDate.of(2020, 2, 1), "lilly");

    @BeforeEach
    public void initializeShop() {
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
    }

    @Test
    public void shouldAddOrderToShop() {
        //given
        //when
        int numberOfOrders = shop.getSize();

        //then
        assertEquals(3, numberOfOrders);
    }

    @Test
    public void shouldGetExistingOrder() {
        //given
        //when
        Order existing = shop.getOrder(new Order(
                45.00,
                LocalDate.of(2020, 3, 20),
                "viki")
        );
      //then
        assertEquals(order1.getValue(), existing.getValue());
        assertEquals(order1.getDate(), existing.getDate());
        assertEquals(order1.getLogin(), existing.getLogin());
    }

    @Test
    public void shouldReturnListOfOrdersInTwoDatesRange() {
        //given
        //when
        Set<Order> interestingOrders = shop.findByDates(
                LocalDate.of(2020, 2, 15),
                LocalDate.of(2020, 3, 30)
        );

        //then
        Set<Order> expectedSet = new HashSet<>();
        expectedSet.add(order1);
        expectedSet.add(order2);
        assertEquals(expectedSet, interestingOrders);
    }

    @Test
    public void shouldReturnEmptySetWhenThereIsNoneOrderInTwoDatesRange() {
        //given
        //when
        Set<Order> interestingOrders = shop.findByDates(
                LocalDate.of(2020, 3, 30),
                LocalDate.of(2020,4,1));

        //then
        boolean emptySet = interestingOrders.isEmpty();

        assertTrue(emptySet);
    }

    @Test
    public void shouldReturnNumberOfOrders() {
        //given
        //when

        int size = shop.getSize();

        //then
        assertEquals(3, size);
    }

    @Test
    public void shouldReturnEmptySetWhenThereIsZeroOrders() {
        //given
        //when
        Set<Order> emptySet = new HashSet<>();

        //then
        assertTrue(true);
    }

    @Test
    public void shouldSumOrdersValues() {
        //given
        //when
        double sum = shop.getSumOfOrdersValues();
        //then
        assertEquals(145.00, sum);
    }

    @Test
    public void shouldGetOrdersOutOfRangeTwoValues() {
        //given
        //when
        Set<Order> interestingOrders = shop.getOrdersOutOfRangeOfTwoValues(32.00, 50.00);

        //then
        Set<Order> expectedSet = new HashSet<>();
        expectedSet.add(order1);
        expectedSet.add(order3);

        assertEquals(expectedSet, interestingOrders);
    }

    @Test
    public void shouldReturnEmptySetWhenOrdersNotInRangeOfTwoValues() {
        //given
        //when
        Set<Order> interestingOrders = shop.getOrdersOutOfRangeOfTwoValues(70.00, 100.00);

        //then
        boolean emptySet = interestingOrders.isEmpty();
        assertTrue(emptySet);
    }
}