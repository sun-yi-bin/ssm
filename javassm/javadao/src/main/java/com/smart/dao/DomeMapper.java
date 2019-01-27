package com.smart.dao;

import com.smart.pojo.Dome;

import java.util.List;

/**
 * @description:
 * @author: abi
 * @date: 2019-01-26 21:01
 */
public interface DomeMapper
{
    List<Dome> selectAll();
    int insertdemo(Dome dome);
}
