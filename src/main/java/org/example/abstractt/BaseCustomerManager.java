package org.example.abstractt;

import org.example.entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService {

    @Override
    public void save(Customer customer) throws Exception {
        System.out.println("Saved to db : " + customer.getFirstName() + " " + customer.getLastName());
    }
}
