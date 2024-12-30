package com.nhlstenden.booking;

import com.nhlstenden.booking.Person;

public class Ticket
{
    private Flight flight;
    private Person person;

    public Ticket(Flight flight, Person person)
    {
        this.flight = flight;
        this.person = person;
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
}
