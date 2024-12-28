package com.nhlstenden.validators;

import com.nhlstenden.useraccount.UserAccount;

public interface Validator
{
    boolean validate(UserAccount userAccount);
}
