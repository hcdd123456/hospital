package com.hyit.hospital.service;

import com.github.pagehelper.PageInfo;
import com.hyit.hospital.model.Department;

import java.util.List;

/**
 * @author hc
 * @create 2020/9/1 0001 11:00
 */
public interface DepartmentService {
    List<Department> selAll();

    PageInfo<Department> selectAll(Integer currPage, com.hyit.hospital.model.Department department);
}
