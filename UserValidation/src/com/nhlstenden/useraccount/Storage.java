package com.nhlstenden.useraccount;

import com.nhlstenden.useraccount.UserAccount;

import java.util.ArrayList;

public class Storage
{
    private ArrayList<UserAccount> userAccounts;

    public Storage(ArrayList<UserAccount> userAccounts)
    {
        this.userAccounts = userAccounts;
    }

    public ArrayList<UserAccount> getUserAccounts()
    {
        return userAccounts;
    }

    public void setUserAccounts(ArrayList<UserAccount> userAccounts)
    {
        this.userAccounts = userAccounts;
    }
}
