package com.hyit.hospital.service.Impl;

import com.hyit.hospital.mapper.DepartmentMapper;
import com.hyit.hospital.model.Department;
import com.hyit.hospital.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;

/**
 * @author hc
 * @create 2020/9/1 0001 11:00
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> selAll() {
        return departmentMapper.selectAll();
    }
}
