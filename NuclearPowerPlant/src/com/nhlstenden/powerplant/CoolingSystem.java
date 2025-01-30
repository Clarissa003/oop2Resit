package com.nhlstenden.powerplant;

import com.nhlstenden.controlroom.Status;
import com.nhlstenden.controlroom.Statusable;

public class CoolingSystem implements Statusable
{
    private double waterTemperature;

    public CoolingSystem()
    {
        this.waterTemperature = 0;
    }

    public double getWaterTemperature() {
        return waterTemperature;
    }

    public void setWaterTemperature(double waterTemperature) {
        this.waterTemperature = waterTemperature;
    }

    public void abductResidualHeat(double residualHeat)
    {
        this.setWaterTemperature(residualHeat * 0.40);
    }

    @Override
    public Status getStatus() {
        if(this.getWaterTemperature() >= 80 && this.getWaterTemperature() <= 90)
        {
            return Status.NEEDS_ATTENTION;
        }
        else if(this.getWaterTemperature() > 90)
        {
            return Status.UNSTABLE;
        }
        return Status.STABLE;
    }
}
