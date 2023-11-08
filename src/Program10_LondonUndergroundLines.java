/*
Write a programme that tells you which line passes through particular stations.
Just use Zone 1 stations name.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Program10_LondonUndergroundLines {

    public static void main(String[] args) {
        // Create a mapping of Zone 1 stations to the lines they belong to
        Map<String, Set<String>> stationToLines = new HashMap<>();

        // Populate the mapping (in reality, you'd fetch this data from a database or external source)
        stationToLines.put("Victoria", Set.of("Victoria Line", "Circle Line"));
        stationToLines.put("Oxford Circus", Set.of("Victoria Line", "Central Line", "Bakerloo Line"));
        stationToLines.put("Waterloo", Set.of("Bakerloo Line", "Jubilee Line", "Northern Line"));

        // Query for a specific station
        String stationName = "Oxford Circus";
        Set<String> lines = stationToLines.get(stationName);

        if (lines != null) {
            System.out.println("The following lines pass through " + stationName + ":");
            for (String line : lines) {
                System.out.println(line);
            }
        } else {
            System.out.println("Station " + stationName + " is not in Zone 1 or doesn't exist.");
        }
    }
}
