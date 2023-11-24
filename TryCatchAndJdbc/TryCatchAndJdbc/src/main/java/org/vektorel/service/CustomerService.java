package org.vektorel.service;

import org.vektorel.entity.Customer;
import org.vektorel.repository.CustomerRepository;
import org.vektorel.utility.Singleton;

public class CustomerService {
    CustomerRepository customerRepository= new CustomerRepository();
    CategoryService categoryService= Singleton.getCategoryService();
    ÜrünService ürünService= new ÜrünService();
    private static CustomerService customerService;



    public void saveCustomer(Customer customer){
        Singleton.getCustomerRepository();
        System.out.println(customer.toString()+" -> kayit edildi");
    }

















































    public static CustomerService getInstance() {
        if (customerService==null){
            return new CustomerService();
        }
        return customerService;
    }
}
