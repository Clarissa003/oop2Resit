package com.nhlstenden.icu;

import com.nhlstenden.codeblackexception.CodeBlackException;
import com.nhlstenden.devices.BloodpressureMonitor;
import com.nhlstenden.devices.Device;
import com.nhlstenden.devices.HeartMonitor;
import com.nhlstenden.patient.Patient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class IcuTest
{
    Icu icu;
    Bed bed1;
    Bed bed2;
    Patient patient1;
    Patient patient2;
    Device heartmonitor;
    Device bloodpressuremonitor;


    @BeforeEach
    void setUp()
    {
        this.patient1 = new Patient("Clarissa", LocalDate.of(2003,6,6),'F');
        this.patient2 = new Patient("Alicia",LocalDate.of(2004,6,11),'F');

        this.heartmonitor = new HeartMonitor("BH473",89,patient1);
        this.bloodpressuremonitor = new BloodpressureMonitor("LM7283",56,patient1);

        ArrayList<Device> devices = new ArrayList<>();
        devices.add(heartmonitor);
        devices.add(bloodpressuremonitor);

        this.bed1 = new Bed(devices);
        this.bed2 = new Bed(devices);

        bed1.addPatientToBed(patient1);

        ArrayList<Bed> beds = new ArrayList<>();
        beds.add(bed1);
        beds.add(bed2);

        this.icu = new Icu(beds,"Emmen",40);
    }

    @Test
    void getEmptyBeds()
    {
        assertEquals(1,icu.getEmptyBeds().size());
    }

    @Test
    void canNewPatientBeAdmitted()
    {
        assertTrue(icu.canNewPatientBeAdmitted(patient2));
    }

    @Test
    void getFirstAvailableBed()
    {
        assertEquals(bed2,icu.getFirstAvailableBed());
    }

    @Test
    void addPatient() throws CodeBlackException
    {
        icu.addPatient(patient2);
        assertEquals(bed2.getPatient(), patient2);
    }

    @Test
    void addPatient_expectException() throws CodeBlackException
    {
        Patient patient3 = new Patient("Someone",LocalDate.of(2000,6,22),'M');
        icu.addPatient(patient2);

        assertThrows(CodeBlackException.class, () -> {
            icu.addPatient(patient3);
        });
    }
}