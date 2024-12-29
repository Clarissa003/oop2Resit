package com.nhlstenden.appstores;

import com.nhlstenden.user.App;
import com.nhlstenden.user.User;

import java.util.HashMap;
import java.util.List;

public class AppleAppStore extends AppStore
{
    public AppleAppStore(Currency currency, HashMap<User, List<App>> purchases)
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

        // Iterate over all user purchases
        for (List<App> apps : this.getPurchases().values()) {
            // Count how many times the specific app was purchased
            for (App purchasedApp : apps) {
                if (purchasedApp.equals(app)) {
                    totalAppRevenue += app.getPrice();
                }
            }
        }
        return totalAppRevenue;
    }
}
