package org.example.Abstract;

import org.example.Entities.Customer;
import org.example.Abstract.ICustomerCheckService;

public abstract class BaseCustomerManager implements ICustomerService {
    public void Save(Customer customer) {


        System.out.println("Saved to db :  " + customer.Firstname + customer.Lastname + customer.DateofBirth + customer.NationalityId);


    }

    public abstract void Save();
}
