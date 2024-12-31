package com.nhlstenden.flight24;

import com.nhlstenden.flight24.Flight24;

import java.util.HashSet;

public class Flight24Uploader
{
    private HashSet<Flight24> information;

    public Flight24Uploader(HashSet<Flight24> information)
    {
        this.information = information;
    }

    public HashSet<Flight24> getInformation()
    {
        return information;
    }

    public void setInformation(HashSet<Flight24> information)
    {
        this.information = information;
    }

    public void upload(Flight24 info)
    {
        this.information.add(info);
    }
}
