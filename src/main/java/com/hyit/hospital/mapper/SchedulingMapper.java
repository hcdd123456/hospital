package com.hyit.hospital.mapper;

import com.hyit.hospital.model.Scheduling;
import java.util.List;

public interface SchedulingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Scheduling record);

    Scheduling selectByPrimaryKey(Integer id);

    List<Scheduling> selectAll(Scheduling scheduling);

    int updateByPrimaryKey(Scheduling record);
}