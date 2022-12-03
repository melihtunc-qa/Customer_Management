package org.example.Abstract;

import org.example.Entities.Customer;

public interface ICustomerCheckService {



    boolean CheckIfRealPerson(Customer customer);

    static boolean CinsiyetErkek(Customer customer) {return true;}

}
