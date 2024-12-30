package com.nhlstenden.plane;

import java.util.HashSet;

public class Plane
{
    private double currentFuelLevel;
    private String code;
    private HashSet<Luggage> luggages;
    private HashSet<Seat> seats;

    public Plane(double currentFuelLevel, String code, HashSet<Luggage> luggages, HashSet<Seat> seats)
    {
        this.currentFuelLevel = currentFuelLevel;
        this.code = code;
        this.luggages = luggages;
        this.seats = seats;
    }

    public double getCurrentFuelLevel()
    {
        return currentFuelLevel;
    }

    public void setCurrentFuelLevel(double currentFuelLevel)
    {
        this.currentFuelLevel = currentFuelLevel;
    }

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public HashSet<Luggage> getLuggages()
    {
        return luggages;
    }

    public void setLuggages(HashSet<Luggage> luggages)
    {
        this.luggages = luggages;
    }

    public HashSet<Seat> getSeats()
    {
        return seats;
    }

    public void setSeats(HashSet<Seat> seats)
    {
        this.seats = seats;
    }
}
