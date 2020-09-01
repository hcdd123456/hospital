package com.hyit.hospital.mapper;

import com.hyit.hospital.model.Department;
import java.util.List;

public interface DepartmentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Department record);

    Department selectByPrimaryKey(Integer id);

    List<Department> selectAll();

    int updateByPrimaryKey(Department record);

    List<Department> selAll(Department department);

}