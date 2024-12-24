package com.nhlstenden.devices;

import com.nhlstenden.devices.Device;
import com.nhlstenden.patient.Patient;

public class HeartMonitor extends Device
{
    public HeartMonitor(String serialNumber, int energyConsumptionInKwh, Patient patient) {
        super(serialNumber, energyConsumptionInKwh, patient);
    }

    @Override
    public String getStatus() {
        String status = "";
        if(this.getPatient().getSex() == 'M')
        {
            if(this.getPatient().getHeartrate() >= 60 && this.getPatient().getHeartrate() <= 75)
            {
                status = "Normal";
            }
            if(this.getPatient().getHeartrate() > 75 && this.getPatient().getHeartrate() <= 100)
            {
                status = "Warning";
            }
            if(this.getPatient().getHeartrate() < 60 && this.getPatient().getHeartrate() > 100)
            {
                status = "Critical";
            }
        }
        if(this.getPatient().getSex() == 'F')
        {
            if(this.getPatient().getHeartrate() >= 70 && this.getPatient().getHeartrate() <= 80)
            {
                status = "Normal";
            }
            if(this.getPatient().getHeartrate() > 80 && this.getPatient().getHeartrate() <= 110)
            {
                status = "Warning";
            }
            if(this.getPatient().getHeartrate() < 70 && this.getPatient().getHeartrate() > 110)
            {
                status = "Critical";
            }
        }

        return status;
    }
}
