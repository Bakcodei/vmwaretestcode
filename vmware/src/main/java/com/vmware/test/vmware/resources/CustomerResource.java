package com.vmware.test.vmware.resources;


import com.vmware.test.vmware.entities.Customer;
import com.vmware.test.vmware.services.impl.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.lang.annotation.Repeatable;
import java.net.URI;
import java.util.List;

@RestController
public class CustomerResource {

    @Autowired
    private CustomerService service;

    @GetMapping("/customers")
    List<Customer> retrieveAllUsers(){return service.findAll();}

    @GetMapping("/customer/{id}")
    Customer retrieveUser(@PathVariable int id){
        return service.findOne(id);
    }

    @PostMapping("/customer")
    ResponseEntity<Object> saveUser(@RequestBody Customer customer)
    {
        Customer savedCustomer = service.save(customer);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/id")
                .buildAndExpand(savedCustomer.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }
}
