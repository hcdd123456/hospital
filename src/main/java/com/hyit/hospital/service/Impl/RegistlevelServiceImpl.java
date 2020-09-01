package com.hyit.hospital.service.Impl;

import com.hyit.hospital.mapper.RegistlevelMapper;
import com.hyit.hospital.model.Registlevel;
import com.hyit.hospital.service.RegistlevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hc
 * @create 2020/9/1 0001 11:09
 */
@Service
public class RegistlevelServiceImpl implements RegistlevelService {

    @Autowired
    private RegistlevelMapper registlevelMapper;

    @Override
    public List<Registlevel> selAll() {
        return registlevelMapper.selectAll();
    }
}
