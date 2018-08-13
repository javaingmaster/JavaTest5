package com.hand.javatest5.infra.mapper;

import com.hand.javatest5.domain.entity.Customer;
import com.hand.javatest5.infra.tkMapper.TkMapper;

public interface CustomerMapper extends TkMapper<Customer> {
    public int insertOne(Customer c);
}
