package com.nhlstenden.fte;

import java.util.ArrayList;

public class FteCalculator
{
    private ArrayList<Fte> ftes;

    public FteCalculator(ArrayList<Fte> ftes)
    {
        this.ftes = ftes;
    }

    public double getTotalFte()
    {
        double totalFte = 0;
        for(Fte fte : this.ftes)
        {
            if(this.ftes.size() > 5)
            {
                totalFte += fte.getFte() + (this.ftes.size() * 0.2);
            }
            else
            {
                totalFte += fte.getFte();
            }
        }
        return totalFte;
    }
}
