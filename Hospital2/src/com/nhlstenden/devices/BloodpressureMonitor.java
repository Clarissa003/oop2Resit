package com.nhlstenden.devices;

import com.nhlstenden.devices.Device;
import com.nhlstenden.patient.Patient;

public class BloodpressureMonitor extends Device
{
    public BloodpressureMonitor(String serialNumber, int energyConsumptionInKwh, Patient patient) {
        super(serialNumber, energyConsumptionInKwh, patient);
    }

    @Override
    public String getStatus() {
        String status = "";
        if(this.getPatient().getBloodpressure().getSystolic() > 120 && this.getPatient().getBloodpressure().getDiastolic() > 80)
        {
            status = "Normal";
        }
        if(this.getPatient().getBloodpressure().getSystolic() > 140 || this.getPatient().getBloodpressure().getSystolic() < 120 && this.getPatient().getBloodpressure().getDiastolic() > 90 || this.getPatient().getBloodpressure().getDiastolic() < 80)
        {
            status = "Warning";
        }
        if(this.getPatient().getBloodpressure().getSystolic() > 180 && this.getPatient().getBloodpressure().getDiastolic() > 110)
        {
            status = "Critical";
        }
        return status;
    }

    @Override
    public double getFte()
    {
        return 0.1;
    }
}
