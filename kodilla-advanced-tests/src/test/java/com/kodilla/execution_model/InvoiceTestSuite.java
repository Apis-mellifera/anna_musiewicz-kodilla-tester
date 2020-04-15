package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTestSuite {

    Invoice invoice = new Invoice();
    Item milk = new Item("Milk", 3.50);
    Item eggs = new Item("Eggs", 8.00);
    Item bread = new Item("Bread", 4.15);

    @Test
    public void shouldAddItemsToInvoice() {
        //given
//        Invoice invoice = new Invoice();
//        Item milk = new Item("Milk", 3.50);
//        Item eggs = new Item("Eggs", 8.00);
//        Item bread = new Item("Bread", 4.15);
//        invoice.addItem(milk);
//        invoice.addItem(eggs);
//        invoice.addItem(bread);

        //when
        int numberOfItems = invoice.getSize();

        //then
        assertEquals(3, numberOfItems);
    }

    @Test
    public void shouldGetExistingItem() {
        //Given
//        Invoice invoice = new Invoice();
//        Item milk = new Item("Milk", 3.50);
//        Item eggs = new Item("Eggs", 8.00);
//        Item bread = new Item("Bread", 4.15);
//        invoice.addItem(milk);
//        invoice.addItem(eggs);
//        invoice.addItem(bread);

        //When
        Item result = invoice.getItem(2);

        //Then
        assertEquals("Bread", result.getName());
        assertEquals(4.15, result.getPrice(), 0.01);
    }

    @Test
    public void shouldReturnNullWhenPassingNegativeIndex() {
        //Given
//        Invoice invoice = new Invoice();
//        Item milk = new Item("Milk", 3.50);
//        Item eggs = new Item("Eggs", 8.00);
//        Item bread = new Item("Bread", 4.15);
//        invoice.addItem(milk);
//        invoice.addItem(eggs);
//        invoice.addItem(bread);

        //When
        Item result = invoice.getItem(-3);

        //Then
        assertNull(result);
    }

    @Test
    public void shouldReturnNullWhenPassingOutOfRangeIndex() {
        //Given
//        Invoice invoice = new Invoice();
//        Item milk = new Item("Milk", 3.50);
//        Item eggs = new Item("Eggs", 8.00);
//        Item bread = new Item("Bread", 4.15);
//        invoice.addItem(milk);
//        invoice.addItem(eggs);
//        invoice.addItem(bread);

        //When
        Item result = invoice.getItem(7);

        //Then
        assertNull(result);
    }

    @Test
    public void shouldClearInvoice() {
        //Given
//        Invoice invoice = new Invoice();
//        Item milk = new Item("Milk", 3.50);
//        Item eggs = new Item("Eggs", 8.00);
//        Item bread = new Item("Bread", 4.15);
//        invoice.addItem(milk);
//        invoice.addItem(eggs);
//        invoice.addItem(bread);

        //When
        invoice.clear();

        //Then
        assertEquals(0, invoice.getSize());
    }

    @BeforeEach
    public void initializeInvoice() {
        invoice.addItem(milk);
        invoice.addItem(eggs);
        invoice.addItem(bread);
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }
}