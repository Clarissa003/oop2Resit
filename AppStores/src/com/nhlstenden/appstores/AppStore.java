package com.nhlstenden.appstores;

import com.nhlstenden.user.User;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class AppStore
{
    private Currency currency;
    private HashMap<User, App> purchases;
    private ArrayList<App> apps;

    public AppStore(Currency currency, HashMap<User, App> purchases)
    {
        this.currency = currency;
        this.purchases = purchases;
        this.apps = new ArrayList<>();
    }

    public Currency getCurrency()
    {
        return currency;
    }

    public void setCurrency(Currency currency)
    {
        this.currency = currency;
    }

    public HashMap<User, App> getPurchases()
    {
        return purchases;
    }

    public void setPurchases(HashMap<User, App> purchases)
    {
        this.purchases = purchases;
    }

    public ArrayList<App> getApps()
    {
        return apps;
    }

    public void setApps(ArrayList<App> apps)
    {
        this.apps = apps;
    }

    public abstract void uploadApp(App app);
    public abstract double getTotalAppRevenue(App app);

    public double getTotalRevenue()
    {
        double totalRevenue = 0;

        for(App app : this.getApps())
        {
            totalRevenue += getTotalAppRevenue(app);
        }
        return totalRevenue;
    }
}
