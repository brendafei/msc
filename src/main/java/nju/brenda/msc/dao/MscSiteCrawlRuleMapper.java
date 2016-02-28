package nju.brenda.msc.dao;

import nju.brenda.msc.domain.MscSiteCrawlRule;

public interface MscSiteCrawlRuleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MscSiteCrawlRule record);

    int insertSelective(MscSiteCrawlRule record);

    MscSiteCrawlRule selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MscSiteCrawlRule record);

    int updateByPrimaryKey(MscSiteCrawlRule record);
}