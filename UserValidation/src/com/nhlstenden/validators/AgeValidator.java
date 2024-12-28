package com.nhlstenden.validators;

import com.nhlstenden.useraccount.UserAccount;

public class AgeValidator implements Validator
{
    private int minimumAge;

    public AgeValidator(int minimumAge)
    {
        this.minimumAge = minimumAge;
    }

    public int getMinimumAge()
    {
        return minimumAge;
    }

    public void setMinimumAge(int minimumAge)
    {
        this.minimumAge = minimumAge;
    }

    @Override
    public boolean validate(UserAccount userAccount)
    {
        if(userAccount.getAge() >= this.minimumAge)
        {
            return true;
        }
        return false;
    }
}
