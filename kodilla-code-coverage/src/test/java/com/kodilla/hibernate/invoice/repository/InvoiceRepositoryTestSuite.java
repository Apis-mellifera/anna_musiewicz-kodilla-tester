package com.kodilla.hibernate.invoice.repository;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceRepositoryTestSuite {

    @Autowired
    private InvoiceRepository invoiceRepository;

    // test ma sprawdzać czy faktura z kilkoma pozycjami zapisuje się poprawnie w bazie danych
    @Transactional
    @Test
    public void testInvoiceRepositorySave() {
        //given
        Item item = new Item(new BigDecimal(30), 10, new BigDecimal(50));
        Item item2 = new Item(new BigDecimal(40), 20, new BigDecimal(60));
        Product product = new Product("Softshell jacket");
        Invoice invoice = new Invoice("FV2345/01/20");
        product.getItems().add(item);
        product.getItems().add(item2);
        item.setProduct(product);
        item2.setProduct(product);
        invoice.getItems().add(item);
        invoice.getItems().add(item2);
        item.setInvoice(invoice);
        item2.setInvoice(invoice);

        //when
        invoiceRepository.save(invoice);
        int id = invoice.getId();

        //then
        Assert.assertNotEquals(0, id);

        //cleanUp
        invoiceRepository.deleteById(id);
    }
}
