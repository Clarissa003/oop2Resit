package com.nhlstenden.validators;

import com.nhlstenden.validators.Validator;

import java.util.ArrayList;

public class Validateable
{
    private ArrayList<Validator> validators;

    public Validateable(ArrayList<Validator> validators)
    {
        this.validators = validators;
    }

    public ArrayList<Validator> getValidators()
    {
        return validators;
    }

    public void setValidators(ArrayList<Validator> validators)
    {
        this.validators = validators;
    }

    public void addValidator(Validator validator)
    {
        this.validators.add(validator);
    }
}
