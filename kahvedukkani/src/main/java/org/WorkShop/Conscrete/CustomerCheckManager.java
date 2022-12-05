package org.example.Conscrete;

import org.example.Abstract.ICustomerService;
import org.example.Entities.Customer;

public abstract class CustomerCheckManager implements ICustomerService {


    @Override
    public void Save(Customer customer) {

    }

    public boolean CheckIfRealPerson( Customer customer){

        return true;
    }





}
