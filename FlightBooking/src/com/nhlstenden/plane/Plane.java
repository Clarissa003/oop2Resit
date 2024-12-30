package com.nhlstenden.plane;

import java.util.HashSet;

public abstract class Plane
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

    public int getSeatsAvailable()
    {
        HashSet<Seat> availableSeats = new HashSet<>();
        for(Seat seat : this.seats)
        {
            if(seat.isAvailable())
            {
                availableSeats.add(seat);
            }
        }
        return availableSeats.size();
    }

    public int getSeatsTaken()
    {
        int seatsTaken = 0;

        seatsTaken = this.getSeats().size() - getSeatsAvailable();
        return seatsTaken;
    }

    public int getTotalLuggageWeight()
    {
        int totalLuggageWeight = 0;

        for(Luggage luggage : this.luggages)
        {
            totalLuggageWeight += luggage.getWeight();
        }
        return totalLuggageWeight;
    }

    public int getEconomySeatsTaken()
    {
        HashSet<Seat> economySeatsTaken = new HashSet<>();

        for(Seat seat : this.seats)
        {
            if(!seat.isAvailable() && seat.getSeatType().equals(SeatType.ECONOMY))
            {
                economySeatsTaken.add(seat);
            }
        }
        return economySeatsTaken.size();
    }

    public int getBusinessSeatsTaken()
    {
        HashSet<Seat> businessSeatsTaken = new HashSet<>();

        for(Seat seat : this.seats)
        {
            if(!seat.isAvailable() && seat.getSeatType().equals(SeatType.BUSINESS))
            {
                businessSeatsTaken.add(seat);
            }
        }
        return businessSeatsTaken.size();
    }

    public int getEconomySeats()
    {
        HashSet<Seat> economySeats = new HashSet<>();

        for(Seat seat : this.seats)
        {
            if(seat.getSeatType().equals(SeatType.ECONOMY))
            {
                economySeats.add(seat);
            }
        }
        return economySeats.size();
    }

    public int getBusinessSeats()
    {
        HashSet<Seat> businessSeats = new HashSet<>();

        for(Seat seat : this.seats)
        {
            if(seat.getSeatType().equals(SeatType.BUSINESS))
            {
                businessSeats.add(seat);
            }
        }
        return businessSeats.size();
    }
    public abstract double getFuel(int distance);
}
