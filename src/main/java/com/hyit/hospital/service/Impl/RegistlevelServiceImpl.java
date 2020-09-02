package com.hyit.hospital.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hyit.hospital.common.Common;
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
    @Override
    public PageInfo<Registlevel> selectAll(Integer currPage, Registlevel registlevel) {
        if (currPage == null){
            currPage = 1;
        }
        PageHelper.startPage(currPage, Common.PAGE_SIZE);
        PageInfo pageInfo = new PageInfo(registlevelMapper.selectAll(registlevel));
        return pageInfo;
    }

    @Override
    public void registlevelAdd(Registlevel registlevel) {
        registlevelMapper.insert(registlevel);
    }

    @Override
    public void delById(Integer id) {
        registlevelMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Registlevel registlevel) {
        registlevelMapper.updateByPrimaryKey(registlevel);
    }

    @Override
    public Registlevel selById(Integer id) {
        return registlevelMapper.selectByPrimaryKey(id);
    }
}
