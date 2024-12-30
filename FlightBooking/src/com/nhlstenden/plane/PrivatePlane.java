package com.nhlstenden.plane;

import com.nhlstenden.plane.Plane;

import java.util.HashSet;

public class PrivatePlane extends Plane
{
    public PrivatePlane(double currentFuelLevel, String code, HashSet<Luggage> luggages, HashSet<Seat> seats)
    {
        super(currentFuelLevel, code, luggages, seats);
    }

    @Override
    public double getFuel(int distance)
    {
        double fuel = 0;

        fuel = this.getSeats().size() * 1.31 * distance + this.getSeatsTaken() * 1.87 + this.getTotalLuggageWeight() * 0.4;
        return fuel;
    }
}
