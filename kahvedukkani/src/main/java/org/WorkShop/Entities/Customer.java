package org.example.Entities;

import java.time.LocalDate;



public class Customer {

    public Customer(int id, String firstname, String lastname, LocalDate dateofBirth, String nationalityId) {
        Id = id;
        firstname = firstname;
        lastname = lastname;
        dateofBirth = LocalDate.parse(String.valueOf(dateofBirth));
        NationalityId = nationalityId;
    }

    public int Id;
        public String Firstname;
        public String Lastname;
        public String DateofBirth;
        public String NationalityId;

}

