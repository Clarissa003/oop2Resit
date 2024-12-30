package com.nhlstenden.flight;

import com.nhlstenden.flight.Airport;

import java.util.HashMap;

public class DistanceCalculator
{
    private static HashMap<Airport, HashMap<Airport,Integer>> distances;

    public DistanceCalculator()
    {
    }

    public static HashMap<Airport, HashMap<Airport, Integer>> getDistances()
    {
        return distances;
    }

    public static void setDistances(HashMap<Airport, HashMap<Airport, Integer>> distances)
    {
        DistanceCalculator.distances = distances;
    }

    public static int getDistance(Airport departure, Airport destination)
    {
        int distance = 0;
        distances = new HashMap<>();

        distances.put(Airport.JFK, new HashMap<>());
        distances.get(Airport.JFK).put(Airport.AMS, 5848);
        distances.get(Airport.JFK).put(Airport.MEX, 3366);
        distances.get(Airport.JFK).put(Airport.LAX,3975);
        distances.get(Airport.LAX).put(Airport.AMS,8956);
        distances.get(Airport.LAX).put(Airport.MEX,2500);
        distances.get(Airport.AMS).put(Airport.MEX,9206);

        if(distances.containsKey(departure) && distances.get(departure).containsKey(destination))
        {
            distance = distances.get(departure).get(destination);
        }
        else if (distances.containsKey(destination) && distances.get(destination).containsKey(departure))
        {
            distance = distances.get(destination).get(departure);
        }
        return distance;
    }

}
