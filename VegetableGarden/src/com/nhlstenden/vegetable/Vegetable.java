package com.nhlstenden.vegetable;

import com.nhlstenden.market.Marketable;

import java.util.HashSet;

public abstract class Vegetable
{
    private double sizeInCm;
    private double cmPerLux;
    private double cmPerMillimeter;
    private int ripeLength;
    private Color color;
    private Status status;

    public Vegetable(double cmPerLux, double cmPerMillimeter, int ripeLength, Color color) {
        this.cmPerLux = cmPerLux;
        this.cmPerMillimeter = cmPerMillimeter;
        this.ripeLength = ripeLength;
        this.color = color;
        this.sizeInCm = 0;
        this.status = null;
    }

    public double getSizeInCm() {
        return sizeInCm;
    }

    public void setSizeInCm(double sizeInCm) {
        this.sizeInCm = sizeInCm;
    }

    public double getCmPerLux() {
        return cmPerLux;
    }

    public void setCmPerLux(double cmPerLux) {
        this.cmPerLux = cmPerLux;
    }

    public double getCmPerMillimeter() {
        return cmPerMillimeter;
    }

    public void setCmPerMillimeter(double cmPerMillimeter) {
        this.cmPerMillimeter = cmPerMillimeter;
    }

    public int getRipeLength() {
        return ripeLength;
    }

    public void setRipeLength(int ripeLength) {
        this.ripeLength = ripeLength;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public abstract void grow(int lux, int mm, int amountOfDays);

}
