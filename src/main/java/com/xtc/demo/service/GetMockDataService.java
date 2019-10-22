package com.xtc.demo.service;

import com.xtc.demo.model.SensorData;

import org.springframework.stereotype.Service;

@Service
public interface GetMockDataService{
    SensorData GetMockDataById();
}