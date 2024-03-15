package org.example.concrete;

import org.example.abstractt.BaseCustomerManager;
import org.example.abstractt.ICustomerCheckService;
import org.example.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

    ICustomerCheckService _customerCheckService;

    public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
        this._customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) throws Exception {
        if (_customerCheckService.CheckIfRealPerson(customer)){
            System.out.println("Valid");
            super.save(customer);
        }
        else{
            throw new Exception("Not a valid person");
        }

    }

    public void addStar(Customer customer){
        System.out.println();
    }

}
