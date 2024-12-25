package com.nhlstenden.icu;

import com.nhlstenden.codeblackexception.CodeBlackException;
import com.nhlstenden.patient.Patient;

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

    public ArrayList<Bed> getEmptyBeds()
    {
        ArrayList<Bed> emptyBeds = new ArrayList<>();
        for(Bed bed : this.beds)
        {
            if(bed.isEmpty())
            {
                emptyBeds.add(bed);
            }
        }
        return emptyBeds;
    }

    public boolean canNewPatientBeAdmitted(Patient patient)
    {
        if(!getEmptyBeds().isEmpty() && patient.getFte() < this.getNumberOfFte())
        {
            return true;
        }
        return false;
    }

    public Bed getFirstAvailableBed()
    {
        Bed firstAvailableBed = null;

        for(Bed bed : this.beds)
        {
            if(firstAvailableBed == null || this.getEmptyBeds().size() == 1 && bed.isEmpty() && this.getEmptyBeds().contains(bed))
            {
                firstAvailableBed = bed;
            }
        }
        return firstAvailableBed;
    }

    public void addPatient(Patient patient) throws CodeBlackException
    {
        for(Bed bed : this.beds)
        {
            if(canNewPatientBeAdmitted(patient))
            {
                bed.addPatientToBed(patient);
            }
            else
            {
                throw new CodeBlackException("The hospital has no room for a new patient");
            }
        }
    }
}
