package com.maxdevsoft.tdd.model;

public class TDDPercentModel {

    private double valueX;
    private double valueY;
    private double valueP;

    public TDDPercentModel(double valueX, double valueY, double valueP) {
        this.valueX = valueX;
        this.valueY = valueY;
        this.valueP = valueP;
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
    public double getValueP() {
        return valueP;
    }
    public void setValueP(double valueP) {
        this.valueP = valueP;
    }

    
    
}
