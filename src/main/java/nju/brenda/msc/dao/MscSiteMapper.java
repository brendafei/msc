package nju.brenda.msc.dao;

import nju.brenda.msc.domain.MscSite;

public interface MscSiteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MscSite record);

    int insertSelective(MscSite record);

    MscSite selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MscSite record);

    int updateByPrimaryKey(MscSite record);
}