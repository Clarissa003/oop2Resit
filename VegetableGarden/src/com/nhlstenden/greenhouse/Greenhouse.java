package com.nhlstenden.greenhouse;

import com.nhlstenden.vegetable.Vegetable;

import java.util.HashSet;

public class Greenhouse
{
    private HashSet<Vegetable> vegetables;

    public Greenhouse()
    {
        this.vegetables = new HashSet<>();
    }

    public HashSet<Vegetable> getVegetables() {
        return vegetables;
    }

    public void setVegetables(HashSet<Vegetable> vegetables) {
        this.vegetables = vegetables;
    }

    public void runWeather()
    {
        int lux = WeatherGenerator.generateLux();
        int mm = WeatherGenerator.generateMm();

        for(Vegetable vegetable : this.vegetables)
        {
            vegetable.grow(lux,mm,1);
        }
    }

}
