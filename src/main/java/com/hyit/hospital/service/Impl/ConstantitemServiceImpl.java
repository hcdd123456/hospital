package com.hyit.hospital.service.Impl;

import com.hyit.hospital.mapper.ConstantitemMapper;
import com.hyit.hospital.model.Constantitem;
import com.hyit.hospital.service.ConstantitemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hc
 * @create 2020/8/31 0031 23:26
 */
@Service
public class ConstantitemServiceImpl implements ConstantitemService {

    @Autowired
    private ConstantitemMapper constantitemMapper;

    @Override
    public List<Constantitem> selAll() {
        return constantitemMapper.selectAll();
    }
}
