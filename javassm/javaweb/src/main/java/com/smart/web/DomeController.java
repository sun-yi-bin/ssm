package com.smart.web;

import com.smart.pojo.Dome;
import com.smart.service.DomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @description:
 * @author: abi
 * @date: 2019-01-26 22:04
 */
@Controller
public class DomeController
{
    @Autowired
    private DomeService domeService;

    @RequestMapping(value = "/index.html")
    public ModelAndView index()
    {
        List<Dome> list = domeService.index();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("userList",list);
        return modelAndView;
    }

    public DomeService getDomeService() {
        return domeService;
    }

    public void setDomeService(DomeService domeService) {
        this.domeService = domeService;
    }
}
