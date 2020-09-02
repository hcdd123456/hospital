package com.hyit.hospital.service;

import com.github.pagehelper.PageInfo;
import com.hyit.hospital.model.Scheduling;

/**
 * @author hc
 * @create 2020/9/2 0002 15:42
 */
public interface SchedulingService {
    PageInfo<Scheduling> selAll(Integer currPage, Scheduling scheduling);
}
