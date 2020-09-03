package com.hyit.hospital.mapper;

import com.hyit.hospital.model.Registlevel;
import java.util.List;

public interface RegistlevelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Registlevel record);

    Registlevel selectByPrimaryKey(Integer id);

    List<Registlevel> selectAll();

    int updateByPrimaryKey(Registlevel record);

    List<Registlevel> selectAll(Registlevel registlevel);

}