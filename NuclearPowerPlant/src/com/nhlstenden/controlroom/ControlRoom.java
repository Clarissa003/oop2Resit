package com.nhlstenden.controlroom;

import java.util.HashSet;

public class ControlRoom
{
    private HashSet<Statusable> statusables;

    public ControlRoom(HashSet<Statusable> statusables) {
        this.statusables = statusables;
    }

    public HashSet<Statusable> getStatusables() {
        return statusables;
    }

    public void setStatusables(HashSet<Statusable> statusables) {
        this.statusables = statusables;
    }

    public void addStatusable(Statusable statusable)
    {
        this.statusables.add(statusable);
    }

    public boolean isNuclearReactorStable()
    {
        for(Statusable statusable : this.statusables)
        {
            if(statusable.getStatus().equals(Status.UNSTABLE))
            {
                return false;
            }
        }
        return true;
    }

}
