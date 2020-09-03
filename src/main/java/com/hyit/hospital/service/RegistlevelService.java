package com.hyit.hospital.service;

import com.github.pagehelper.PageInfo;
import com.hyit.hospital.model.Registlevel;

import java.util.List;
import java.util.Map;

/**
 * @author hc
 * @create 2020/9/1 0001 11:09
 */
public interface RegistlevelService {
    List<Registlevel> selAll();
    PageInfo<Registlevel> selectAll(Integer currPage, Registlevel registlevel);

    void registlevelAdd(Registlevel registlevel);

    Map<String,Object> delById(Integer id);

    void update(Registlevel registlevel);

    Registlevel selById(Integer id);
}
