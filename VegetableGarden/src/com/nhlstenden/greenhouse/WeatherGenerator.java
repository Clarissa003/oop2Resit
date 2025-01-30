package com.nhlstenden.greenhouse;

public class WeatherGenerator
{

    public static int generateLux()
    {
        int min = 1000;
        int max = 101592;

        int randomLux = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return randomLux;
    }

    public static int generateMm()
    {
        int min = 0;
        int max = 48;

        int randomMm = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return randomMm;
    }
}
