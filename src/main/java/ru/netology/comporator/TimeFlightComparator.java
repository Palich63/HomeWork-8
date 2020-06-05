package ru.netology.comporator;

import ru.netology.domain.FlightOffer;

public class TimeFlightComparator implements Comparator<FlightOffer> {
    public int compare(FlightOffer o1, FlightOffer o2) {
        return o1.getTime() - o2.getTime();
    }

    @Override
    public void fast(FlightOffer flightOffer) {

    }
}