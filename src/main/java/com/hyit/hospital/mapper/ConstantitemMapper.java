package com.hyit.hospital.mapper;

import com.hyit.hospital.model.Constantitem;
import java.util.List;

public interface ConstantitemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Constantitem record);

    Constantitem selectByPrimaryKey(Integer id);

    List<Constantitem> selectAll();

    int updateByPrimaryKey(Constantitem record);
}