package com.nhlstenden.devices;

import com.nhlstenden.patient.Patient;

public abstract class Device
{
    private String serialNumber;
    private int energyConsumptionInKwh;
    private Patient patient;

    public Device(String serialNumber, int energyConsumptionInKwh, Patient patient)
    {
        this.serialNumber = serialNumber;
        this.energyConsumptionInKwh = energyConsumptionInKwh;
        this.patient = patient;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getEnergyConsumptionInKwh() {
        return energyConsumptionInKwh;
    }

    public void setEnergyConsumptionInKwh(int energyConsumptionInKwh) {
        this.energyConsumptionInKwh = energyConsumptionInKwh;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public abstract String getStatus();
}
