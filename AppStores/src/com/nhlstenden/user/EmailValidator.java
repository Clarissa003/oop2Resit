package com.nhlstenden.user;

public class EmailValidator
{
    public static String validate(String email)
    {
        String emailRegex = "^[A-Za-z0-9._%-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

        if(email.matches(emailRegex))
        {
            return email;
        }
        return null;
    }
}
