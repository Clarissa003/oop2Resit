package com.nhlstenden.plane;

import com.nhlstenden.plane.Plane;

import java.util.HashSet;

public class PrivatePlane extends Plane
{
    public PrivatePlane(double currentFuelLevel, String code, HashSet<Luggage> luggages, HashSet<Seat> seats)
    {
        super(currentFuelLevel, code, luggages, seats);
    }
}
