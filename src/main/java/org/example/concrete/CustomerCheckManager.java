package org.example.concrete;

import org.example.abstractt.ICustomerCheckService;
import org.example.entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {
    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        return true;
    }
}
