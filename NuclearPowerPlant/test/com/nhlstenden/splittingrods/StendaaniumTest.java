package com.nhlstenden.splittingrods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StendaaniumTest {
    Stendaanium stendaanium;

    @org.junit.jupiter.api.BeforeEach
    void setUp()
    {
        this.stendaanium = new Stendaanium();
    }

    @Test
    void split() throws MeltdownException {
        SplitResult result = this.stendaanium.split(1,40);

        assertEquals(2000, result.getResidualSteam());
        assertEquals(40,result.getResidualHeat());
    }

    @Test
    void split_expectException() throws MeltdownException {

        assertThrows(MeltdownException.class, () -> stendaanium.split(1,155));

    }
}