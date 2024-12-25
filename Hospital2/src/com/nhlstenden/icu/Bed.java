package com.nhlstenden.icu;

import com.nhlstenden.devices.Device;
import com.nhlstenden.patient.Patient;

import java.util.ArrayList;

public class Bed
{
    private ArrayList<Device> devices;
    private Patient patient;

    public Bed(ArrayList<Device> devices)
    {
        this.devices = devices;
        this.patient = null;
    }

    public ArrayList<Device> getDevices() {
        return devices;
    }

    public void setDevices(ArrayList<Device> devices) {
        this.devices = devices;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void addDevice (Device device)
    {
        this.devices.add(device);
    }

    public boolean isEmpty()
    {
        if(getPatient() != null)
        {
            return false;
        }
        return true;
    }

    public void addPatientToBed(Patient patient)
    {
        if(this.isEmpty())
        {
            this.setPatient(patient);
        }
    }
}
