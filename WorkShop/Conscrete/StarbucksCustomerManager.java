package org.example.Conscrete;

import org.example.Abstract.BaseCustomerManager;
import org.example.Abstract.ICustomerCheckService;
import org.example.Abstract.ICustomerService;
import org.example.Entities.Customer;

import javax.swing.*;

public abstract class StarbucksCustomerManager extends BaseCustomerManager implements ICustomerCheckService {
    private ICustomerCheckService customerCheckService;
    public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }


    @Override
    public void Save(Customer customer) {


        if (ICustomerService.CheckIfRealPerson)
        CheckIfRealPerson(customer);
        super.Save(customer);
    }

    public boolean CheckIfRealPerson(Customer customer) {
        return false;
    }

}



