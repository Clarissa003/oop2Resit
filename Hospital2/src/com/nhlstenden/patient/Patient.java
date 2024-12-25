package com.nhlstenden.patient;

import com.nhlstenden.fte.Fte;

import java.time.LocalDate;

public class Patient implements Fte
{
    private String name;
    private LocalDate dateOfBirth;
    private char sex;
    private int heartrate;
    private Bloodpressure bloodpressure;
    private boolean canWalk;

    public Patient(String name, LocalDate dateOfBirth, char sex)
    {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.bloodpressure = null;
        this.canWalk = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getHeartrate() {
        return heartrate;
    }

    public void setHeartrate(int heartrate) {
        this.heartrate = heartrate;
    }

    public Bloodpressure getBloodpressure() {
        return bloodpressure;
    }

    public void setBloodpressure(Bloodpressure bloodpressure) {
        this.bloodpressure = bloodpressure;
    }

    public boolean isCanWalk() {
        return canWalk;
    }

    public void setCanWalk(boolean canWalk) {
        this.canWalk = canWalk;
    }

    @Override
    public double getFte()
    {
        if(this.canWalk)
        {
            return 1.0;
        }
        return 2.0;
    }
}
