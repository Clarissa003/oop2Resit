package com.nhlstenden.appstores;

import com.nhlstenden.user.User;

import java.util.HashMap;

public class AppleAppStore extends AppStore
{
    public AppleAppStore(Currency currency, HashMap<User, App> purchases)
    {
        super(currency, purchases);
    }

    @Override
    public void uploadApp(App app)
    {
        this.getApps().add(app);
    }

    @Override
    public double getTotalAppRevenue(App app)
    {
        double totalAppRevenue = 0;

        if(this.getPurchases().containsKey(app))
        {
            totalAppRevenue += app.getPrice();
        }
        return totalAppRevenue;
    }
}
