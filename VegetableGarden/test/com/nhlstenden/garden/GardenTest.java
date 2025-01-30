package com.nhlstenden.garden;

import com.nhlstenden.vegetable.Asparagus;
import com.nhlstenden.vegetable.Color;
import com.nhlstenden.vegetable.Pepper;
import com.nhlstenden.vegetable.Vegetable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class GardenTest {
    Garden garden;

    @BeforeEach
    void setUp()
    {
        this.garden = new Garden();

        HashSet<Vegetable> vegetables = new HashSet<>();

        for(int i = 0; i < 28; i++)
        {
            Vegetable pepper = new Pepper(0.000012,0.00033,15, Color.RED);
            vegetables.add(pepper);
        }

        garden.setVegetables(vegetables);
    }

    @Test
    void addVegetable_throwsException()
    {
        Vegetable asparagus = new Asparagus(0.0012,0.0029,20,Color.BLUE);
        assertThrows(TooManyVegetablesException.class, () -> {
            garden.addVegetable(asparagus);
        });
    }
}