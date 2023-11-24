package org.vektorel.utility;

import org.vektorel.repository.CategoryRepository;
import org.vektorel.repository.CustomerRepository;
import org.vektorel.service.CategoryService;
import org.vektorel.service.CustomerService;

public class Singleton {
    private static CategoryService categoryService;
    private static CustomerRepository customerRepository;
    private static CustomerService customerService;
    private static CategoryRepository categoryRepository;


    public static CategoryRepository getCategoryRepository (){
        if (categoryRepository==null){
            return new CategoryRepository();
        }else {
            return categoryRepository;
        }


    }
















    public static CategoryService getCategoryService(){
        if (categoryService==null){

            return new CategoryService();
        }else {
            return categoryService;

        }

    }

    public static CustomerRepository getCustomerRepository(){

        if (customerRepository==null){
            customerRepository= new CustomerRepository();
            return customerRepository;
        }else {
            return customerRepository;
        }
    }

}
