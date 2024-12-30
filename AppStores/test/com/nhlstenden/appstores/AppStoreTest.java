package com.nhlstenden.appstores;

import com.nhlstenden.user.App;
import com.nhlstenden.user.DownloadNotAllowedException;
import com.nhlstenden.user.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppStoreTest
{
    Currency currency;
    User user;
    App app;
    App app2;
    AppStore googleplaystore;
    AppStore applestore;

    @BeforeEach
    void setUp() throws DownloadNotAllowedException
    {
        this.currency = Currency.EURO;
        this.user = new User("Clarissa","clari.dbrc@gmail.com", LocalDate.of(2003,6,6));

        this.app = new App("Subway Surfers",5,true,true);
        this.app2 = new App("Cash of Clans",10,true,true);

        ArrayList<App> apps = new ArrayList<>();
        apps.add(app);

        HashMap<User, List<App>> purchases = new HashMap<>();
        purchases.computeIfAbsent(user, k -> new ArrayList<>()).add(app);

        this.googleplaystore = new GooglePlayStore(Currency.EURO,purchases);
        this.applestore = new AppleAppStore(Currency.EURO,purchases);
        this.applestore.getApps().add(app);
        this.applestore.purchaseApp(user,app);

    }

    @Test
    void uploadApp()
    {
        this.applestore.getApps().add(app2);
        assertEquals(2,this.applestore.getApps().size());
    }

    @Test
    void uploadApp_exception()
    {
        this.googleplaystore.getApps().add(app2);
        assertThrows(Exception.class, () -> {
            this.googleplaystore.uploadApp(app2);
        });
    }

    @Test
    void getTotalAppRevenue_gp()
    {
        assertEquals(3.5,this.googleplaystore.getTotalAppRevenue(app));
    }

    @Test
    void getTotalAppRevenue_as()
    {
        assertEquals(5,this.applestore.getTotalAppRevenue(app));
    }

    @Test
    void getTotalRevenue()
    {
        assertEquals(5,this.applestore.getTotalRevenue());
    }

    @Test
    void purchaseApp() throws DownloadNotAllowedException
    {
        this.applestore.getApps().add(app2);
        applestore.purchaseApp(user,app2);
        assertTrue(applestore.getPurchases().get(user).contains(app2));
    }

    @Test
    void purchaseApp_exception()
    {
        User user2 = new User("Alicia","alicia.rb@gmail.com",LocalDate.of(2020,4,12));
        assertThrows(DownloadNotAllowedException.class, () -> {
            this.applestore.purchaseApp(user2,app);
        });
    }
}