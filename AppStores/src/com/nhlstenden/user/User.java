package com.nhlstenden.user;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User
{
    private String name;
    private String email;
    private LocalDate dateOfBirth;
    private ArrayList<App> apps;

    public User(String name, String email, LocalDate dateOfBirth)
    {
        this.name = name;
        this.email = EmailValidator.validate(email);
        this.dateOfBirth = dateOfBirth;
        this.apps = new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
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

    public ArrayList<App> getApps()
    {
        return apps;
    }

    public void setApps(ArrayList<App> apps)
    {
        this.apps = apps;
    }

    public int getAge()
    {
        LocalDate now = LocalDate.now();
        int age = Period.between(this.dateOfBirth,now).getYears();
        return age;
    }

    public void downloadApp(App app) throws DownloadNotAllowedException
    {
        if(app.isContainsNudity() && this.getAge() >= 18)
        {
            this.apps.add(app);
        }
        if(app.isContainsViolence() && this.getAge() >= 16)
        {
            this.apps.add(app);
        }
        else
        {
            throw new DownloadNotAllowedException("You do not meet the conditions to download this app");
        }
    }
}
