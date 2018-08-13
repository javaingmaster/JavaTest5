package com.hand.javatest5.api.service.impl;

import com.hand.javatest5.api.service.CustomerService;
import com.hand.javatest5.domain.entity.Customer;
import com.hand.javatest5.infra.mapper.CustomerMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service("customerServiceImpl")
public class CustomerServiceImpl implements CustomerService {
    private final Logger logger=LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CustomerMapper cm;

    @Override
    public int login(String name, String pwd) {
        Customer c=new Customer(name,pwd);
        List<Customer> list=cm.select(c);
        if(list!=null && list.size()==1){
            logger.info("login successful!");
            return list.get(0).getCustomerId();
        }
        logger.info("login failed!");
        return -1;
    }

    @Override
    public int save(Customer c) {
        logger.info("save!");
        return cm.insertOne(c);
    }

    @Override
    public Customer update(Customer c) {
        logger.info("update");
        cm.updateByPrimaryKey(c);
        return cm.selectByPrimaryKey(c.getCustomerId());
    }

    @Override
    public int delete(HttpServletRequest req) {
        logger.info("delete");

        Cookie[] cookies=req.getCookies();
        int uid=0;
        for (Cookie c:cookies){
            if(c.getName().equals("cid")){
                uid=Integer.parseInt(c.getValue());
                break;
            }
        }
        return cm.deleteByPrimaryKey(uid);
    }
}
