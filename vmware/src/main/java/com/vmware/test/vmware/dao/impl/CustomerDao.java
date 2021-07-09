package com.vmware.test.vmware.dao.impl;

import com.vmware.test.vmware.dao.ICustormerDao;
import com.vmware.test.vmware.entities.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerDao implements ICustormerDao {
    private static int custIdCount = 0;

    private static List<Customer> custs = new ArrayList<>();

    public List<Customer> findAll() {
        return custs;
    }

    public Customer findOne(int id) {
        for (Customer cust : custs) {
            if (cust.getId() == id) {
                return cust;
            }
        }
        return null;
    }

    @Override
    public Customer addCustomer(Customer cust) {
        if (cust.getId() == null) {
            cust.setId(++custIdCount);
        }
        custs.add(cust);
        return cust;
    }


}
