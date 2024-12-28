package com.nhlstenden.appstores;

import com.nhlstenden.appstores.AppStore;
import com.nhlstenden.user.User;

import java.util.HashMap;

public class GooglePlayStore extends AppStore
{
    public GooglePlayStore(Currency currency, HashMap<User, App> purchases)
    {
        super(currency, purchases);
    }

    @Override
    public void uploadApp(App app)
    {
        if(!app.isContainsNudity())
        {
            this.getApps().add(app);
        }
    }

    @Override
    public double getTotalAppRevenue(App app)
    {
        double totalAppRevenue = 0;

        if(this.getPurchases().containsKey(app))
        {
            totalAppRevenue += app.getPrice() - 0.3 * (app.getPrice());
        }
        return totalAppRevenue;
    }
}
