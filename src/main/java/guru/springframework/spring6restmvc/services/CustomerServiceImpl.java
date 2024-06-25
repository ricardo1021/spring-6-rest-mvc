package guru.springframework.spring6restmvc.services;

import guru.springframework.spring6restmvc.model.Customer;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService{

    Map<UUID,Customer> customerMap;

    public CustomerServiceImpl() {
        customerMap = new HashMap<>();

        Customer.CustomerBuilder customerBuilder1 = Customer.builder();
        customerBuilder1.id(UUID.randomUUID());
        customerBuilder1.customerName("Edison");
        customerBuilder1.version("Version 1");
        customerBuilder1.createdDate(new Date());
        customerBuilder1.lastModifiedDate(new Date());
        customerBuilder1.build();

        Customer.CustomerBuilder customerBuilder2 = Customer.builder();
        customerBuilder2.id(UUID.randomUUID());
        customerBuilder2.customerName("Ricardo");
        customerBuilder2.version("Version 2");
        customerBuilder2.createdDate(new Date());
        customerBuilder2.lastModifiedDate(new Date());
        customerBuilder2.build();

        customerMap.put(customerBuilder1.build().getId(), customerBuilder1.build());
        customerMap.put(customerBuilder2.build().getId(), customerBuilder2.build());

    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerMap.values().stream().toList();
    }

    @Override
    public Customer getCustomerByID(UUID id) {
        return customerMap.get(id);
    }
}
