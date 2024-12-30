package com.nhlstenden.appstores;

import com.nhlstenden.user.App;
import com.nhlstenden.user.DownloadNotAllowedException;
import com.nhlstenden.user.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class AppStore
{
    private Currency currency;
    private HashMap<User, List<App>> purchases;
    private ArrayList<App> apps;

    public AppStore(Currency currency, HashMap<User, List<App>> purchases)
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

    public HashMap<User, List<App>> getPurchases()
    {
        return purchases;
    }

    public void setPurchases(HashMap<User, List<App>> purchases)
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
    public abstract void uploadApp(App app) throws Exception;
    public abstract double getTotalAppRevenue(App app);

    public double getTotalRevenue()
    {
        double totalRevenue = 0;

        for (App app : this.apps) {
            totalRevenue += this.getTotalAppRevenue(app);
        }
        return totalRevenue;
    }

    public void purchaseApp(User user, App app) throws DownloadNotAllowedException
    {
        if(app.isContainsNudity() && user.getAge() >= 18)
        {
            this.purchases.computeIfAbsent(user, k -> new ArrayList<>()).add(app);

        }
        if(app.isContainsViolence() && user.getAge() >= 16)
        {
            this.purchases.computeIfAbsent(user, k -> new ArrayList<>()).add(app);
        }
        else
        {
            throw new DownloadNotAllowedException("You do not meet the conditions to download this app");
        }
    }
}
