package com.maxdevsoft.tdd.model;

public class TDDPercentModel {

    private double valueX;
    private double valueY;
    private double valueP1;
    private double valueP2;

    public TDDPercentModel(double valueX, double valueY, double valueP1, double valueP2) {
        this.valueX = valueX;
        this.valueY = valueY;
        this.valueP1 = valueP1;
        this.valueP2 = valueP2;
    }

    public TDDPercentModel() {
    
    }
    
    public double getValueX() {
        return valueX;
    }
    public void setValueX(double valueX) {
        this.valueX = valueX;
    }
    public double getValueY() {
        return valueY;
    }
    public void setValueY(double valueY) {
        this.valueY = valueY;
    }
    public double getValueP1() {
        return valueP1;
    }
    public void setValueP1(double valueP1) {
        this.valueP1 = valueP1;
    }

    public double getValueP2() {
        return valueP2;
    }
    public void setValueP2(double valueP2) {
        this.valueP2 = valueP2;
    }
    
    
}
