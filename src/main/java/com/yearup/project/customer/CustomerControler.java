package com.yearup.project.customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerControler {
    @GetMapping("/customer")
    public Customer getCustomer(@RequestParam(value = "customerId", defaultValue = "000001") final String customerId) {
        return new Customer(customerId, "yuliiaatyearup", "Yuliia Hlamazdenko");
    }
}
