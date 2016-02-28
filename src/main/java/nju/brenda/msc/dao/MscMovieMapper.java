package nju.brenda.msc.dao;

import nju.brenda.msc.domain.MscMovie;

public interface MscMovieMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MscMovie record);

    int insertSelective(MscMovie record);

    MscMovie selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MscMovie record);

    int updateByPrimaryKey(MscMovie record);
}