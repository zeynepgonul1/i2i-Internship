package com.swagger.service;

import com.swagger.dto.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final Map<Long, CustomerDTO> customerRepo = new HashMap<>();
    private Long idCounter = 1L;

    @Override
    public CustomerDTO createCustomer(CustomerDTO customer) {
        customer.setId(idCounter++);
        customerRepo.put(customer.getId(), customer);
        return customer;
    }

    @Override
    public CustomerDTO getCustomerById(Long id) {
        return customerRepo.get(id);
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return new ArrayList<>(customerRepo.values());
    }

    @Override
    public CustomerDTO updateCustomer(Long id, CustomerDTO customer) {
        if (!customerRepo.containsKey(id)) return null;
        customer.setId(id);
        customerRepo.put(id, customer);
        return customer;
    }

    @Override
    public void deleteCustomer(Long id) {
        customerRepo.remove(id);
    }
}
