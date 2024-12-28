package com.nhlstenden.useraccount;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class UserAccount
{
    private String name;
    private String password;
    private String email;
    private LocalDate dateOfBirth;

    public UserAccount(String name, String password, String email, LocalDate dateOfBirth)
    {
        this.name = name;
        this.password = password;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public LocalDate getDateOfBirth()
    {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge()
    {
        LocalDate now = LocalDate.now();
        int age = Period.between(this.dateOfBirth,now).getYears();
        return age;
    }
}
