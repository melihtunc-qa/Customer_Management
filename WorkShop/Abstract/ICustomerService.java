package org.example.Abstract;

import org.example.Entities.Customer;

public interface ICustomerService {


    boolean CheckIfRealPerson = true;

    public void Save(Customer customer);

    void Delete(Customer customer);



}
