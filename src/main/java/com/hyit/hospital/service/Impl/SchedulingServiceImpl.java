package com.hyit.hospital.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hyit.hospital.common.Common;
import com.hyit.hospital.mapper.SchedulingMapper;
import com.hyit.hospital.model.Scheduling;
import com.hyit.hospital.service.SchedulingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author hc
 * @create 2020/9/2 0002 15:42
 */
@Service
public class SchedulingServiceImpl implements SchedulingService {

    @Autowired
    private SchedulingMapper schedulingMapper;

    @Override
    public PageInfo<Scheduling> selAll(Integer currPage, Scheduling scheduling) {
        if(currPage == null){
            currPage = 1;
        }
        PageHelper.startPage(currPage, Common.PAGE_SIZE);
        PageInfo<Scheduling> pageInfo = new PageInfo<>(schedulingMapper.selectAll(scheduling));
        return pageInfo;
    }
}
