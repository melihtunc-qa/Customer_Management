package org.example;


import org.example.Abstract.BaseCustomerManager;
import org.example.Conscrete.NeroCustomerManager;
import org.example.Entities.Customer;

import java.util.Date;

public class App {
    public static void main(String[] args) {

        BaseCustomerManager customerManager = new NeroCustomerManager() {
            @Override
            public void Delete(Customer customer) {

            }

            @Override
            public void Save() {

            }


        }
        customerManager.Save();


    }
}

