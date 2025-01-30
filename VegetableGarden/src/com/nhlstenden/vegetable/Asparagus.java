package com.nhlstenden.vegetable;

import com.nhlstenden.market.Marketable;

public class Asparagus extends Vegetable implements Marketable
{
    public Asparagus(double cmPerLux, double cmPerMillimeter, int ripeLength, Color color) {
        super(0.000027, 0.0049, 20, Color.BLUE);
    }

    @Override
    public void grow(int lux, int mm, int amountOfDays) {
        if(mm < 14 && amountOfDays == 10)
        {
            setStatus(Status.DESTROYED);
        }
        else
        {
            setStatus(Status.GROWING);
        }
    }

    @Override
    public boolean isMarketable() {
        if(this.getSizeInCm() <= 29)
        {
            return true;
        }
        return false;
    }

    @Override
    public double getPrice() {
        return 0.12 * this.getSizeInCm();
    }
}
