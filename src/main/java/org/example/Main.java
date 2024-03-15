package org.example;

import org.example.abstractt.BaseCustomerManager;
import org.example.concrete.StarbucksCustomerManager;
import org.example.controller.MernisController;
import org.example.entities.Customer;

import java.util.Date;


public class Main {
    public static void main(String[] args) throws Exception {
        BaseCustomerManager baseCustomerManager=new StarbucksCustomerManager(new MernisController());
        Customer customer = new Customer();
        customer.setId(1);
        customer.setFirstName("Yasin");
        customer.setLastName("Özyazıcı");
        customer.setDateOfBirth(new Date(2001,11,16));
        customer.setNationalityId("46165855550");
        baseCustomerManager.save(customer);

    }
}