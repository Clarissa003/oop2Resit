package com.nhlstenden.splittingrods;

public class SplitResult
{
    private double residualSteam;
    private double residualHeat;

    public SplitResult(double residualSteam, double residualHeat) {
        this.residualSteam = residualSteam;
        this.residualHeat = residualHeat;
    }

    public double getResidualSteam() {
        return residualSteam;
    }

    public void setResidualSteam(double residualSteam) {
        this.residualSteam = residualSteam;
    }

    public double getResidualHeat() {
        return residualHeat;
    }

    public void setResidualHeat(double residualHeat) {
        this.residualHeat = residualHeat;
    }
}
