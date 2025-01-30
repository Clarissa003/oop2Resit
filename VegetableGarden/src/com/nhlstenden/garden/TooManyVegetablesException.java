package com.nhlstenden.garden;

public class TooManyVegetablesException extends Exception
{
    public TooManyVegetablesException(String message) {
        super("Only 27 vegetables can fit in this garden");
    }
}
