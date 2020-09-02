package com.hyit.hospital.controller;

import com.github.pagehelper.PageInfo;
import com.hyit.hospital.model.Rule;
import com.hyit.hospital.service.RuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hc
 * @create 2020/9/2 0002 11:10
 */
@RequestMapping("/rule")
@RestController
public class RuleController {

    @Autowired
    private RuleService ruleService;

    @RequestMapping("selAll/{currPage}")
    public PageInfo<Rule> selAll(@PathVariable Integer currPage, @RequestBody Rule rule){
        return ruleService.selAll(currPage,rule);
    }

}
