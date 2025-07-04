package com.swagger.controller;

import com.swagger.dto.CustomerDTO;
import com.swagger.service.CustomerService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @PostMapping
    public CustomerDTO create(@Valid @RequestBody CustomerDTO customer) {
        return service.createCustomer(customer);
    }

    @GetMapping("/{id}")
    public CustomerDTO getById(@PathVariable Long id) {
        return service.getCustomerById(id);
    }

    @GetMapping
    public List<CustomerDTO> getAll() {
        return service.getAllCustomers();
    }

    @PutMapping("/{id}")
    public CustomerDTO update(@PathVariable Long id, @Valid @RequestBody CustomerDTO customer) {
        return service.updateCustomer(id, customer);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteCustomer(id);
    }
}
