package com.nhlstenden.appstores;

import com.nhlstenden.appstores.AppStore;
import com.nhlstenden.user.App;
import com.nhlstenden.user.User;

import java.util.HashMap;
import java.util.List;

public class GooglePlayStore extends AppStore
{
    public GooglePlayStore(Currency currency, HashMap<User, List<App>> purchases)
    {
        super(currency, purchases);
    }

    @Override
    public void uploadApp(App app) throws Exception
    {
        if(!app.isContainsNudity())
        {
            this.getApps().add(app);
        }
        else
        {
            throw new Exception("Apps that contain nudity are not allowed on this store");
        }
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
        return totalAppRevenue - 0.3 * (totalAppRevenue);
    }
}
