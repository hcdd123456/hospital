package com.hyit.hospital.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hyit.hospital.common.Common;
import com.hyit.hospital.mapper.RuleMapper;
import com.hyit.hospital.model.Rule;
import com.hyit.hospital.service.RuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author hc
 * @create 2020/9/2 0002 11:09
 */
@Service
public class RuleServiceImpl implements RuleService {

    @Autowired
    private RuleMapper ruleMapper;

    @Override
    public PageInfo<Rule> selAll(Integer currPage, Rule rule) {
        if (currPage == null){
            currPage = 1;
        }
        PageHelper.startPage(currPage, Common.PAGE_SIZE);
        PageInfo<Rule> pageInfo = new PageInfo(ruleMapper.selectAll(rule));
        return pageInfo;
    }
}
