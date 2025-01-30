package com.nhlstenden.splittingrods;

public abstract class SplittingRod
{
    private double percentageLeft;

    public SplittingRod()
    {
        this.percentageLeft = 100.0;
    }

    public double getPercentageLeft() {
        return percentageLeft;
    }

    public void setPercentageLeft(double percentageLeft) {
        this.percentageLeft = percentageLeft;
    }

    public abstract SplitResult split(int time, int temperature) throws MeltdownException;
}
