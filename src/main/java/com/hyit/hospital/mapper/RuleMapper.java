package com.hyit.hospital.mapper;

import com.hyit.hospital.model.Rule;
import java.util.List;

public interface RuleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Rule record);

    Rule selectByPrimaryKey(Integer id);

    List<Rule> selectAll(Rule rule);

    int updateByPrimaryKey(Rule record);
}