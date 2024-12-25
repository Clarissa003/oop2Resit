package com.nhlstenden.devices;

import com.nhlstenden.patient.Bloodpressure;
import com.nhlstenden.patient.Patient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DeviceTest
{
    Patient patient;
    Device heartmonitor;
    Device bloodpressuremonitor;
    Bloodpressure bloodpressure;


    @BeforeEach
    void setUp()
    {
        this.patient = new Patient("Clarissa", LocalDate.of(2003,06,06),'F');
        this.heartmonitor = new HeartMonitor("A455",345,patient);
        this.bloodpressuremonitor = new BloodpressureMonitor("B455",678,patient);

        this.bloodpressure = new Bloodpressure(190,120);

        this.patient.setBloodpressure(bloodpressure);
        this.patient.setHeartrate(90);

    }

    @Test
    void getStatus_BloodPressure()
    {
        assertEquals("Critical",this.bloodpressuremonitor.getStatus());
    }

    @Test
    void getStatus_HeartMonitor()
    {
        assertEquals("Warning",this.heartmonitor.getStatus());
    }
}