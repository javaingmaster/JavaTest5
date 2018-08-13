package com.hand.javatest5.api.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.javatest5.api.service.FilmService;
import com.hand.javatest5.domain.entity.Film;
import com.hand.javatest5.domain.entity.Page;
import com.hand.javatest5.infra.mapper.FilmMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("filmServiceImpl")
public class FilmServiceImpl implements FilmService {


    @Autowired
    private FilmMapper fm;

    @Override
    public List<Film> findAll(Page page) {
        PageHelper.startPage(page.getPage(),page.getPageSize());
        return fm.selectAll();
    }
}
