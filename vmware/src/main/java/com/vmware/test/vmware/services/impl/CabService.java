package com.vmware.test.vmware.services.impl;

import com.vmware.test.vmware.dao.impl.CabDao;
import com.vmware.test.vmware.dao.impl.CustomerDao;
import com.vmware.test.vmware.entities.Cab;
import com.vmware.test.vmware.entities.Customer;

import java.util.List;

public class CabService {
    CabDao cabDao = new CabDao();

    public List<Cab> findAll() {
        List<Cab> cabs  = cabDao.findAll();
        return  cabs;
    }

    public Cab findOne(int id) {
        return cabDao.findOne(id);
    }

    public Cab save(Cab cab) {
        return cabDao.addCab(cab);
    }
}
