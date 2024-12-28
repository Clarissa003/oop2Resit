package com.nhlstenden.validators;

import com.nhlstenden.useraccount.Storage;
import com.nhlstenden.useraccount.UserAccount;

public class UsernameValidator implements Validator
{
    private Storage storage;

    public UsernameValidator(Storage storage)
    {
        this.storage = storage;
    }

    public Storage getStorage()
    {
        return storage;
    }

    public void setStorage(Storage storage)
    {
        this.storage = storage;
    }

    @Override
    public boolean validate(UserAccount userAccount)
    {
        if(storage.getUserAccounts().contains(userAccount))
        {
            return true;
        }
        return false;
    }
}

