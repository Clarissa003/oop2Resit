package com.nhlstenden.booking;

import java.util.HashSet;

public class BookingAgency
{
    private HashSet<Flight> flights;
    private HashSet<Ticket> tickets;

    public BookingAgency(HashSet<Flight> flights, HashSet<Ticket> tickets)
    {
        this.flights = flights;
        this.tickets = tickets;
    }

    public HashSet<Flight> getFlights()
    {
        return flights;
    }

    public void setFlights(HashSet<Flight> flights)
    {
        this.flights = flights;
    }

    public HashSet<Ticket> getTickets()
    {
        return tickets;
    }

    public void setTickets(HashSet<Ticket> tickets)
    {
        this.tickets = tickets;
    }
}
