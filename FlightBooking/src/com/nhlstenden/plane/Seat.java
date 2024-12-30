package com.nhlstenden.plane;

public class Seat
{
    private SeatType seatType;
    private boolean isAvailable;

    public Seat(SeatType seatType, boolean isAvailable)
    {
        this.seatType = seatType;
        this.isAvailable = isAvailable;
    }

    public SeatType getSeatType()
    {
        return seatType;
    }

    public void setSeatType(SeatType seatType)
    {
        this.seatType = seatType;
    }

    public boolean isAvailable()
    {
        return isAvailable;
    }

    public void setAvailable(boolean available)
    {
        isAvailable = available;
    }

    public void reserveSeat()
    {
        if(this.isAvailable)
        {
            this.setAvailable(false);
        }
    }
}
