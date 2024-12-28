package com.nhlstenden.validators;

import com.nhlstenden.useraccount.UserAccount;

public class EmailValidator implements Validator
{

    @Override
    public boolean validate(UserAccount userAccount)
    {
        String emailRegex = "^[A-Za-z0-9._%-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        if(userAccount.getEmail().matches(emailRegex))
        {
            return true;
        }
        return false;
    }
}
