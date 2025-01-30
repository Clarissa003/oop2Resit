package com.nhlstenden.vegetable;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class VegetableTest {


    Vegetable asparagus;

    @BeforeEach
    void setUp()
    {
        this.asparagus = new Asparagus(0.000012,0.030,15,Color.BLUE);
    }

    @Test
    void grow()
    {
        int lux = 20;
        int mm = 12;
        int amountOfDays = 10;
        asparagus.grow(lux,mm,amountOfDays);

        assertEquals(asparagus.getStatus(), Status.DESTROYED);
    }

    @Test
    void grow_statusGrowing()
    {
        int lux = 20;
        int mm = 18;
        int amountOfDays = 12;
        asparagus.grow(lux,mm,amountOfDays);

        assertEquals(asparagus.getStatus(), Status.GROWING);
    }
}