package com.nhlstenden.icu;

import com.nhlstenden.devices.BloodpressureMonitor;
import com.nhlstenden.devices.Device;
import com.nhlstenden.devices.HeartMonitor;
import com.nhlstenden.patient.Patient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BedTest
{
    Bed bed;
    Patient patient;
    Device heartmonitor;
    Device bloodpressuremonitor;

    @BeforeEach
    void setUp()
    {
        this.patient = new Patient("Clarissa", LocalDate.of(2003,06,06),'F');
        this.heartmonitor = new HeartMonitor("A455",345,patient);
        this.bloodpressuremonitor = new BloodpressureMonitor("B455",678,patient);

        ArrayList<Device> devices = new ArrayList<>();
        devices.add(heartmonitor);
        devices.add(bloodpressuremonitor);

        this.bed = new Bed(devices);

        this.bed.setPatient(patient);
    }

    @Test
    void isEmpty()
    {
        assertFalse(this.bed.isEmpty());
    }

    @Test
    void isEmpty_assertTrue()
    {
        this.bed.setPatient(null);
        assertTrue(this.bed.isEmpty());
    }
}