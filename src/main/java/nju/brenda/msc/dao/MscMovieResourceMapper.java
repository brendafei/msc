package nju.brenda.msc.dao;

import nju.brenda.msc.domain.MscMovieResource;

public interface MscMovieResourceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MscMovieResource record);

    int insertSelective(MscMovieResource record);

    MscMovieResource selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MscMovieResource record);

    int updateByPrimaryKey(MscMovieResource record);
}