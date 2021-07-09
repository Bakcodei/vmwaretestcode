package com.vmware.test.vmware.dao.impl;

import com.vmware.test.vmware.dao.ICabDao;
import com.vmware.test.vmware.entities.Cab;
import com.vmware.test.vmware.entities.Customer;

import java.util.ArrayList;
import java.util.List;

public class CabDao implements ICabDao {

    private static int cabIdCount = 0;

    private static List<Cab> cabs = new ArrayList<>();

    public List<Cab> findAll() {
        return cabs;
    }

    public Cab findOne(int id) {
        for (Cab cab : cabs) {
            if (cab.getId() == id) {
                return cab;
            }
        }
        return null;
    }

    @Override
    public Cab addCab(Cab cab) {
        if (cab.getId() == null) {
            cab.setId(++cabIdCount);
        }
        cabs.add(cab);
        return cab;
    }
}
