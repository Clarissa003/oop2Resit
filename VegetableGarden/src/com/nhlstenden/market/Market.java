package com.nhlstenden.market;

import java.util.HashSet;

public class Market
{
    private HashSet<Marketable> marketables;

    public Market(HashSet<Marketable> marketables) {
        this.marketables = marketables;
    }

    public HashSet<Marketable> getMarketables() {
        return marketables;
    }

    public void setMarketables(HashSet<Marketable> marketables) {
        this.marketables = marketables;
    }

    public double getProfit()
    {
        double profit = 0;
        for(Marketable marketable : this.marketables)
        {
            profit += marketable.getPrice();
        }
        return profit;
    }
}
