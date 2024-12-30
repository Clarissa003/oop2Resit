package com.nhlstenden.plane;

import com.nhlstenden.plane.Plane;

import java.util.HashSet;

public class CommercialPlane extends Plane
{
    public CommercialPlane(double currentFuelLevel, String code, HashSet<Luggage> luggages, HashSet<Seat> seats)
    {
        super(currentFuelLevel, code, luggages, seats);
    }
}
