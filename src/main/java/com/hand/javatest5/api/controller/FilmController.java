package com.hand.javatest5.api.controller;

import com.hand.javatest5.api.service.CustomerService;
import com.hand.javatest5.api.service.FilmService;
import com.hand.javatest5.domain.entity.Page;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class FilmController {
    private final Logger logger=LoggerFactory.getLogger(this.getClass());

   @Resource(name = "filmServiceImpl")
    private FilmService fs;

    @RequestMapping(value = "/films",method = RequestMethod.GET)
    public Object findAll(@RequestBody Page page){
        logger.info("execute findFilms!");
        return fs.findAll(page);
    }
}
