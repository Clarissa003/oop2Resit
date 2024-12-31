package com.nhlstenden.plane;

import com.nhlstenden.plane.Plane;

import java.util.HashSet;

public class CommercialPlane extends Plane
{
    public CommercialPlane(double currentFuelLevel, String code, HashSet<Luggage> luggages, HashSet<Seat> seats)
    {
        super(currentFuelLevel, code, luggages, seats);
    }

    @Override
    public double getFuel(int distance)
    {
        double fuel = 0;

        fuel = this.getEconomySeats() * 1.75 + this.getBusinessSeats() * 1.98 * distance + this.getEconomySeatsTaken() * 2.02 + this.getBusinessSeatsTaken() * 2.87 + this.getTotalLuggageWeight() * 0.3;
        return fuel;
    }

    @Override
    public void addLuggage(Luggage luggage)
    {
        this.getLuggages().add(luggage);
    }
}
