package com.hyit.hospital.service;

import com.github.pagehelper.PageInfo;
import com.hyit.hospital.model.Rule;

/**
 * @author hc
 * @create 2020/9/2 0002 11:09
 */
public interface RuleService {
    PageInfo<Rule> selAll(Integer currPage, Rule rule);

}
