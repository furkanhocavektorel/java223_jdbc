package org.vektorel.service;

import org.vektorel.utility.Singleton;

public class ÜrünService {

    CategoryService categoryService= Singleton.getCategoryService();
    CustomerService customerService = CustomerService.getInstance();
    //CustomerService customerService1= Singleton.getCustomerRepository();
}
