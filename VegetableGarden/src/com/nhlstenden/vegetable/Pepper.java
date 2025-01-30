package com.nhlstenden.vegetable;

import com.nhlstenden.market.Marketable;

public class Pepper extends Vegetable implements Marketable
{
    public Pepper(double cmPerLux, double cmPerMillimeter, int ripeLength, Color color) {
        super(0.000044, 0.0013, 7, Color.PINK);
    }

    @Override
    public void grow(int lux, int mm, int amountOfDays) {
        if(mm > 31 && amountOfDays > 4)
        {
            setStatus(Status.DESTROYED);
        }
        if(mm < 25 && amountOfDays > 10)
        {
            setStatus(null);
        }
        else
        {
            setStatus(Status.GROWING);
        }
    }

    @Override
    public boolean isMarketable() {
        if(this.getSizeInCm() >= 15 && this.getSizeInCm() <= 21)
        {
            return true;
        }
        return false;
    }

    @Override
    public double getPrice() {
        return 0.15 * this.getSizeInCm();
    }
}
