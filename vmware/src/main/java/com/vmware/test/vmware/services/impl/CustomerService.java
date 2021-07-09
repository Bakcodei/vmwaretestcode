package com.vmware.test.vmware.services.impl;

import com.vmware.test.vmware.dao.impl.CustomerDao;
import com.vmware.test.vmware.entities.Customer;
import com.vmware.test.vmware.services.ICustomerServices;

import java.util.List;

public class CustomerService implements ICustomerServices {
    CustomerDao customerDao = new CustomerDao();

    public List<Customer> findAll() {
        List<Customer> cutomers  = customerDao.findAll();
        return  cutomers;
    }

    public Customer findOne(int id) {
        return customerDao.findOne(id);
    }

    public Customer save(Customer customer) {
        return customerDao.addCustomer(customer);
    }
}
