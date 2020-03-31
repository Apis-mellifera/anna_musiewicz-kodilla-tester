package com.kodilla.exeption.homework;

import org.junit.Test;

public class WarehouseTestSuite {
    @Test(expected = OrderDoesntExistExeption.class)
    public void shouldTrowExceptionWhenOrderDoesntExist() throws OrderDoesntExistExeption {
        //given
        Warehouse warehouse = new Warehouse();
        //when
        warehouse.getOrder("365RT");
        //then
    }

}