package com.example.demo.presentation;

import java.util.ArrayList;
import java.util.List;
 
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
 
import com.example.demo.model.Customer;
 

@ManagedBean
@ViewScoped
public class CustomerBean {
    private List<Customer> customers;
 
    public List<Customer> getCustomers() {
        return customers;
    }
 
    @PostConstruct
    public void setup()  {
        List<Customer> customers = new ArrayList<Customer>();
 
        Customer customer1 = new Customer();
        customer1.setName("User");
        customer1.setLastName("user-layout.xhtml");
 
        customers.add(customer1);
 
        Customer customer2 = new Customer();
        customer2.setName("Place");
        customer2.setLastName("place-layout.xhtml");
        
        customers.add(customer2);
 

        this.customers = customers;
    }
}