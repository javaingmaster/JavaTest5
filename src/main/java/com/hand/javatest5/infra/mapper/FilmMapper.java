package com.hand.javatest5.infra.mapper;

import com.hand.javatest5.domain.entity.Film;
import com.hand.javatest5.infra.tkMapper.TkMapper;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface FilmMapper extends TkMapper<Film> {

}
