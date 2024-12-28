package com.nhlstenden.validators;

import com.nhlstenden.useraccount.Storage;
import com.nhlstenden.useraccount.UserAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest
{
    UserAccount userAccount;
    Validator password;
    Validator email;
    Validator age;
    Validator username;
    Storage storage;
    UserAccount userAccount2;

    @BeforeEach
    void setUp()
    {
        this.userAccount = new UserAccount("Clarissa","clari2003","clari@gmail.com", LocalDate.of(2003,6,6));
        this.userAccount2 = new UserAccount("Someone","psswd11","email@gmail.com",LocalDate.of(2000,12,12));
        ArrayList<UserAccount> userAccounts = new ArrayList<>();

        userAccounts.add(userAccount);
        userAccounts.add(userAccount2);

        this.storage = new Storage(userAccounts);

        this.password = new PasswordValidator(false,false,true,true,false);
        this.email = new EmailValidator();
        this.age = new AgeValidator(18);
        this.username = new UsernameValidator(storage);
    }

    @Test
    void validateAge()
    {
        assertTrue(this.age.validate(userAccount));
    }

    @Test
    void validateUsername()
    {
        assertTrue(this.username.validate(userAccount));
    }

    @Test
    void validatePassword()
    {
        assertTrue(this.password.validate(userAccount));
    }

    @Test
    void validateEmail()
    {
        assertTrue(this.email.validate(userAccount));
    }
}