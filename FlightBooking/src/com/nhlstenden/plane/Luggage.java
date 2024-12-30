package com.nhlstenden.plane;

public class Luggage
{
    private int weight;
    private LuggageType luggageType;

    public Luggage(int weight, LuggageType luggageType)
    {
        this.weight = weight;
        this.luggageType = luggageType;
    }

    public int getWeight()
    {
        return weight;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    public LuggageType getLuggageType()
    {
        return luggageType;
    }

    public void setLuggageType(LuggageType luggageType)
    {
        this.luggageType = luggageType;
    }
}
