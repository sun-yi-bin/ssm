package com.smart.service;

import com.smart.dao.DomeMapper;
import com.smart.pojo.Dome;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: abi
 * @date: 2019-01-26 22:18
 */
@Service
public class DomeService
{
    @Autowired
    private DomeMapper domeMapper;
    public List<Dome> index()
    {
        return domeMapper.selectAll();
    }

    @Override
    public String toString() {
        return "DomeService{" +
                "domeMapper=" + domeMapper +
                '}';
    }

    public DomeMapper getDomeMapper() {
        return domeMapper;
    }

    public void setDomeMapper(DomeMapper domeMapper) {
        this.domeMapper = domeMapper;
    }
}
