package com.hand.javatest5.api.service;

import com.hand.javatest5.domain.entity.Film;
import com.hand.javatest5.domain.entity.Page;

import java.util.List;

public interface FilmService {
    public List<Film> findAll(Page page);
}
