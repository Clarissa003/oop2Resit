package com.nhlstenden.garden;

import com.nhlstenden.vegetable.Status;
import com.nhlstenden.vegetable.Vegetable;

import java.util.HashSet;

public class Garden
{
    private HashSet<Vegetable> vegetables;

    public Garden()
    {
        this.vegetables = new HashSet<>();
    }

    public HashSet<Vegetable> getVegetables() {
        return vegetables;
    }

    public void setVegetables(HashSet<Vegetable> vegetables) {
        this.vegetables = vegetables;
    }

    public HashSet<Vegetable> getReadyForHarvest()
    {
        HashSet<Vegetable> readyVegetables = new HashSet<>();
        for(Vegetable vegetable : this.vegetables)
        {
            if(vegetable.getStatus().equals(Status.READY_TO_HARVEST))
            {
                readyVegetables.add(vegetable);
            }
        }
        return readyVegetables;
    }

    public void addVegetable(Vegetable vegetable) throws TooManyVegetablesException {
        if(this.vegetables.size() < 27)
        {
            vegetables.add(vegetable);
        }
        else
        {
            throw new TooManyVegetablesException("Only 27 vegetables can fit in this garden");
        }
    }
}
