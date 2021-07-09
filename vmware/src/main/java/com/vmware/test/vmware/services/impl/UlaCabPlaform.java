package com.vmware.test.vmware.services.impl;

import com.vmware.test.vmware.entities.Cab;
import com.vmware.test.vmware.entities.Customer;
import com.vmware.test.vmware.entities.Location;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UlaCabPlaform {

    CustomerService customerService = new CustomerService();
    CabService cabService = new CabService();

    @GetMapping("/user/{id}/cabs")
    List<Cab> findCab(@PathVariable int customerId){
        List<Cab> cabs = cabService.findAll();
        Customer customer =  customerService.findOne(customerId);
        Location customerLocation = customer.getLocation();

        return cabs;
    }

    List<Cab> findNearestCabs(Customer customer, Cab cab){
        List<Cab> cabs = new ArrayList<>();
        return cabs;
    }

}
