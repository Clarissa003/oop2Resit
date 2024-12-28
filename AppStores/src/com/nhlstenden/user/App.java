package com.nhlstenden.user;

public class App
{
    private String name;
    private double price;
    private boolean containsNudity;
    private boolean containsViolence;

    public App(String name, double price, boolean containsNudity, boolean containsViolence)
    {
        this.name = name;
        this.price = price;
        this.containsNudity = containsNudity;
        this.containsViolence = containsViolence;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public boolean isContainsNudity()
    {
        return containsNudity;
    }

    public void setContainsNudity(boolean containsNudity)
    {
        this.containsNudity = containsNudity;
    }

    public boolean isContainsViolence()
    {
        return containsViolence;
    }

    public void setContainsViolence(boolean containsViolence)
    {
        this.containsViolence = containsViolence;
    }
}
