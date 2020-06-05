package ru.netology.comporator;

import ru.netology.domain.FlightOffer;

public interface Comparator<F> {
    void fast(FlightOffer flightOffer);
}
