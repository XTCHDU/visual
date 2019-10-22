package com.xtc.demo.controller;

import com.xtc.demo.model.SensorData;
import com.xtc.demo.service.GetMockDataServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @Autowired
    private GetMockDataServiceImpl getMockDataServiceImpl;

    @RequestMapping("/")
    public String home() {
        return "query";
    }

    @RequestMapping(value = "getMockData", method = RequestMethod.POST)
    @ResponseBody
    public SensorData getMockData() {
        return getMockDataServiceImpl.GetMockDataById();
    }
}