package guru.springframework.spring6restmvc.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomerServiceTest {

    @Autowired
    CustomerService customerService;

    @Test
    void getAllCustomers() {

        System.out.println(customerService.getAllCustomers());
    }

    @Test
    void getCustomerByID() {
    }
}