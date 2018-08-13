package com.hand.javatest5.api.controller;

import com.hand.javatest5.api.service.CustomerService;
import com.hand.javatest5.domain.entity.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class CustomerController {
    private final Logger logger=LoggerFactory.getLogger(this.getClass());

    @Resource(name = "customerServiceImpl")
    private CustomerService cs;

    @RequestMapping(value = "/customers",method = RequestMethod.POST)
    public Object login(@RequestParam(value = "name") String name,@RequestParam(value = "password") String pwd){
        logger.info("execute login.");
       return cs.login(name,pwd);
    }

    @RequestMapping(value = "/customers",method = RequestMethod.PUT)
    public Object save(@RequestBody Customer c){
        logger.info("execute save.");
        int uid=cs.save(c);
        return uid;
    }

    @RequestMapping(value = "/customers/{uid}",method = RequestMethod.POST)
    public Object update(@PathVariable(value = "uid") int uid,@RequestBody Customer c){
        logger.info("execute update.");
        c.setCustomerId(uid);
        return cs.update(c);
    }

    @RequestMapping(value = "/customers",method = RequestMethod.DELETE)
    public Object delete(HttpServletRequest req){
        logger.info("execute delete.");
       return cs.delete(req);
    }
}
