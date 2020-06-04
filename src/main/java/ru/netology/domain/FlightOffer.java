package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightOffer implements Comparable<FlightOffer>{

    private int id;
    private int cost;
    private String arrival;
    private String departure;
    private int time;

    public boolean matchesArrival(String search) {
        if (arrival.equalsIgnoreCase(search)){
            return true;
        }
        return false;
    }

    public boolean matchesDeparture(String search) {
        if (departure.equalsIgnoreCase(search)){
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(FlightOffer flight) {
        return cost - flight.cost;
    }
}
