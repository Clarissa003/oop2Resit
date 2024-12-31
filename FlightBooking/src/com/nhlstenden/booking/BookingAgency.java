package com.nhlstenden.booking;

import com.nhlstenden.flight.Airport;
import com.nhlstenden.flight.Flight;
import com.nhlstenden.flight.Status;
import com.nhlstenden.plane.*;

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

    public Flight getFlightToBook(Airport departure, Airport destination)
    {
        Seat reservedSeat = null;
        Flight flightToBook = null;
        for (Flight flight : this.flights)
        {
            if (flightToBook == null || flight.getDeparture() == departure && flight.getDestination() == destination)
            {
                if (!flightToBook.getStatus().equals(Status.DEPARTED))
                {
                    flightToBook = flight;
                    this.flights.add(flightToBook);
                }
            }
        }
        return flightToBook;
    }

    public Seat getReservedSeat()
    {
        Seat reservedSeat = null;
        for(Flight flight : this.flights)
        {
            for(Seat seat : flight.getPlane().getSeatsAvailable())
            {
                if(!flight.getPlane().getSeatsAvailable().isEmpty() && seat.isAvailable())
                {
                    if (flight.getPlane() instanceof PrivatePlane)
                    {
                        reservedSeat = seat;
                    }
                    if (flight.getPlane() instanceof CommercialPlane)
                    {
                        reservedSeat = flight.getPlane().getFirstAvailableSeat();
                    }
                }
            }
        }
        return reservedSeat;
    }
    public HashSet<Luggage> getCheckedLuggages(HashSet<Luggage> luggages)
    {
        HashSet<Luggage> checkedLuggages = new HashSet<>();
        for (Luggage luggage : luggages)
        {
            if (luggage.getLuggageType().equals(LuggageType.CARRY_ON) && luggages.isEmpty())
            {
                checkedLuggages.add(luggage);
            }
            if (luggage.getLuggageType().equals(LuggageType.HOLD))
            {
                checkedLuggages.add(luggage);
            }
        }
        return checkedLuggages;
    }

    public void bookFlight(Airport departure, Airport destination,Person person,HashSet<Luggage> luggages)
    {
        Ticket ticket = new Ticket(getFlightToBook(departure,destination),person,getCheckedLuggages(luggages),getReservedSeat());
        this.getTickets().add(ticket);
    }
}
