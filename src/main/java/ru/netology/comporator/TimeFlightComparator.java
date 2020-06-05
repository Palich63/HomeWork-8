package ru.netology.comporator;

import ru.netology.domain.FlightOffer;

import java.util.Comparator;

public class TimeFlightComparator implements Comparator<FlightOffer> {

    @Override
    public int compare(FlightOffer o, FlightOffer t1) {
        return o.getTime() - t1.getTime();
    }
}