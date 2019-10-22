package com.xtc.demo.model;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class SensorData {
    private double x;
    private double y;
    private double z;
    public SensorData(@NotNull double[] dataList){
        this.x = dataList[0];
        this.y = dataList[1];
        this.z = dataList[2];
    }
    @Override
    public String toString() {
        return "x:" + x + "y:" + y + "z:" + z;
    }
}