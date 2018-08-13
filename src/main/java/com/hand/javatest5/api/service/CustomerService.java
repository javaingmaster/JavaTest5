package com.hand.javatest5.api.service;

import com.hand.javatest5.domain.entity.Customer;

import javax.servlet.http.HttpServletRequest;

public interface CustomerService {
    public int login(String name,String pwd);

    public int save(Customer c);

    public Customer update(Customer c);

    public int delete(HttpServletRequest request);
}
