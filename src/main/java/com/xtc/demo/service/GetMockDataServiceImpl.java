package com.xtc.demo.service;

import java.util.Random;

import com.xtc.demo.model.SensorData;

import org.springframework.stereotype.Service;

@Service
public class GetMockDataServiceImpl implements GetMockDataService {

    private Random random = new Random();

    private double[] getRandomMockData() {
        double[] dataList = new double[3];
        dataList[0] = random.nextDouble() * 2 - 1;
        dataList[1] = random.nextDouble() * 3 - 1;
        dataList[2] = random.nextDouble() * 5 - 1;
        return dataList;
    }

    private int sinCnt = 0;

    private double[] getRandomMockDataBySin() {
        sinCnt++;
        double[] dataList = new double[3];
        dataList[0] = Math.sin(sinCnt) * random.nextDouble() / 1;
        dataList[1] = Math.sin(sinCnt + 2) * random.nextDouble() / 1;
        dataList[2] = Math.sin(sinCnt + 3) * random.nextDouble() / 1;
        return dataList;

    }

    @Override
    public SensorData GetMockDataById() {

        SensorData sensorData = new SensorData(getRandomMockDataBySin());
        System.out.println(sensorData);

        return sensorData;

    }

}