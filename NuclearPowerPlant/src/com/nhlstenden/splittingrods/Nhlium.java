package com.nhlstenden.splittingrods;

public class Nhlium extends SplittingRod
{
    public Nhlium()
    {
    }

    @Override
    public SplitResult split(int time, int temperature) throws MeltdownException {
        double residualSteam = 0;
        double residualHeat = 0;
        this.setPercentageLeft(this.getPercentageLeft() - 0.0006 * time);

        if(temperature < 90)
        {
            residualSteam = temperature/70 * time * 0.9;
            residualHeat =  time * 3;
        }
        else if(time > 60 && temperature > 100 && this.getPercentageLeft() < 0.001)
        {
            throw new MeltdownException();
        }
        else
        {
            residualSteam = 0.9 * (temperature * 0.9)/ time * Math.sqrt(3) * time;
            residualHeat = temperature/10;
        }
        return new SplitResult(residualSteam,residualHeat);
    }
}
