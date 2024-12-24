package com.nhlstenden.icu;

import java.util.ArrayList;

public class Icu
{
    private ArrayList<Bed> beds;
    private String location;
    private int numberOfFte;

    public Icu(ArrayList<Bed> beds, String location, int numberOfFte)
    {
        this.beds = beds;
        this.location = location;
        this.numberOfFte = numberOfFte;
    }

    public ArrayList<Bed> getBeds() {
        return beds;
    }

    public void setBeds(ArrayList<Bed> beds) {
        this.beds = beds;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumberOfFte() {
        return numberOfFte;
    }

    public void setNumberOfFte(int numberOfFte) {
        this.numberOfFte = numberOfFte;
    }

    public void addBed(Bed bed)
    {
        this.beds.add(bed);
    }
}
