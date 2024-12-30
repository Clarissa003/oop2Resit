package com.nhlstenden.flight;

import com.nhlstenden.plane.Plane;

import java.time.LocalDateTime;

public class Flight
{
    private Plane plane;
    private Airport destination;
    private Airport departure;
    private LocalDateTime departureDate;
    private Status status;

    public Flight(Plane plane, Airport destination, Airport departure, LocalDateTime departureDate, Status status)
    {
        this.plane = plane;
        this.destination = destination;
        this.departure = departure;
        this.departureDate = departureDate;
        this.status = status;
    }

    public Plane getPlane()
    {
        return plane;
    }

    public void setPlane(Plane plane)
    {
        this.plane = plane;
    }

    public Airport getDestination()
    {
        return destination;
    }

    public void setDestination(Airport destination)
    {
        this.destination = destination;
    }

    public Airport getDeparture()
    {
        return departure;
    }

    public void setDeparture(Airport departure)
    {
        this.departure = departure;
    }

    public LocalDateTime getDepartureDate()
    {
        return departureDate;
    }

    public void setDepartureDate(LocalDateTime departureDate)
    {
        this.departureDate = departureDate;
    }

    public Status getStatus()
    {
        return status;
    }

    public void setStatus(Status status)
    {
        this.status = status;
    }

    public int getDistance()
    {
        int distance = 0;
        distance = DistanceCalculator.getDistance(this.getDeparture(),this.getDestination());
        return distance;
    }

    public boolean canDepart()
    {
        if(this.getPlane().getCurrentFuelLevel() >= this.getPlane().getFuel(this.getDistance()))
        {
            return true;
        }
        return false;
    }
}
