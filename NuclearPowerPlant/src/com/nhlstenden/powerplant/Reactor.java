package com.nhlstenden.powerplant;

import com.nhlstenden.controlroom.Status;
import com.nhlstenden.controlroom.Statusable;
import com.nhlstenden.splittingrods.SplittingRod;

import java.util.HashSet;

public class Reactor implements Statusable
{
    private HashSet<SplittingRod> splittingRods;

    public Reactor()
    {
        this.splittingRods = new HashSet<>();
    }

    public HashSet<SplittingRod> getSplittingRods() {
        return splittingRods;
    }

    public void setSplittingRods(HashSet<SplittingRod> splittingRods) {
        this.splittingRods = splittingRods;
    }

    public void addCore(SplittingRod splittingRod)
    {
        this.splittingRods.add(splittingRod);
    }

    @Override
    public Status getStatus() {
        if(this.getSplittingRods().size() < 0.002)
        {
            return Status.NEEDS_ATTENTION;
        }
        return Status.STABLE;
    }
}
