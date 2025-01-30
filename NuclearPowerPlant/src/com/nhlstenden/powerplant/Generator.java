package com.nhlstenden.powerplant;

import com.nhlstenden.controlroom.Status;
import com.nhlstenden.controlroom.Statusable;

public class Generator implements Statusable
{
    private double totalProducedKwh;

    public Generator()
    {
        this.totalProducedKwh = 0;
    }

    public double getTotalProducedKwh() {
        return totalProducedKwh;
    }

    public void setTotalProducedKwh(double totalProducedKwh) {
        this.totalProducedKwh = totalProducedKwh;
    }

    public double generateEnergy(double steam)
    {
        double energy = 0;
        energy = steam * 8;
        return energy;
    }

    @Override
    public Status getStatus() {
        if(this.getTotalProducedKwh() > 560)
        {
            return Status.UNSTABLE;
        }
        return Status.STABLE;
    }
}
