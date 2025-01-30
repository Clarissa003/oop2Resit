package com.nhlstenden.vegetable;

public class Kale extends Vegetable
{
    public Kale(double cmPerLux, double cmPerMillimeter, int ripeLength, Color color) {
        super(0.0057, 0.032, 16, Color.YELLOW);
    }

    @Override
    public void grow(int lux, int mm, int amountOfDays) {
        if(mm > 40 && amountOfDays == 6)
        {
            setStatus(null);
        }
        else
        {
            setStatus(Status.GROWING);
        }
    }
}
