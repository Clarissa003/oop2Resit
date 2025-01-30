package com.nhlstenden.splittingrods;

public class Stendaanium extends SplittingRod
{
    public Stendaanium()
    {
    }

    @Override
    public SplitResult split(int time, int temperature) throws MeltdownException {
        double residualSteam = 0;
        double residualHeat = 0;

        if(temperature < 50)
        {
            this.setPercentageLeft(this.getPercentageLeft());
            residualSteam = 50 * temperature;
            residualHeat = time/0.5 * 20;
        }
        if(temperature > 150)
        {
            throw new MeltdownException();
        }
        else
        {
            this.setPercentageLeft(this.getPercentageLeft() - 0.00007 * temperature * time + 0.0004/100);
        }
        return new SplitResult(residualSteam,residualHeat);

    }
}
