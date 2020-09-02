package com.hyit.hospital.controller;

import com.github.pagehelper.PageInfo;
import com.hyit.hospital.model.Scheduling;
import com.hyit.hospital.service.SchedulingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hc
 * @create 2020/9/2 0002 15:43
 */
@RequestMapping("/scheduling")
@RestController
public class SchedulingController {

    @Autowired
    private SchedulingService schedulingService;

    @RequestMapping("selAll/{currPage}")
    public PageInfo<Scheduling> selAll(@PathVariable Integer currPage, @RequestBody Scheduling scheduling){
        return schedulingService.selAll(currPage,scheduling);
    }

}
