package com.nhlstenden.booking;

import com.nhlstenden.booking.Person;
import com.nhlstenden.flight.Flight;
import com.nhlstenden.plane.Luggage;
import com.nhlstenden.plane.Seat;

import java.util.HashSet;

public class Ticket
{
    private Flight flight;
    private Person person;
    private HashSet<Luggage> luggages;
    private Seat seat;

    public Ticket(Flight flight, Person person,HashSet<Luggage> luggages,Seat seat)
    {
        this.flight = flight;
        this.person = person;
        this.luggages = luggages;
        this.seat = seat;
    }

    public Flight getFlight()
    {
        return flight;
    }

    public void setFlight(Flight flight)
    {
        this.flight = flight;
    }

    public Person getPerson()
    {
        return person;
    }

    public void setPerson(Person person)
    {
        this.person = person;
    }

    public HashSet<Luggage> getLuggages()
    {
        return luggages;
    }

    public void setLuggages(HashSet<Luggage> luggages)
    {
        this.luggages = luggages;
    }

    public Seat getSeat()
    {
        return seat;
    }

    public void setSeat(Seat seat)
    {
        this.seat = seat;
    }
}
