package ru.netology.repository;

import ru.netology.domain.FlightOffer;

public class FlightOfferRepository {

    private FlightOffer[] flightOffers = new FlightOffer[0];

    public void save(FlightOffer item) {
        FlightOffer[] tmpFlightOffer = new FlightOffer[flightOffers.length + 1];
        System.arraycopy(flightOffers, 0, tmpFlightOffer, 0, flightOffers.length);
        tmpFlightOffer[tmpFlightOffer.length - 1] = item;
        flightOffers = tmpFlightOffer;
    }

    public FlightOffer[] findAll() {
        return flightOffers;
    }

    public void removeById(int id) {
        FlightOffer[] tmpFlightOffer = new FlightOffer[flightOffers.length - 1];
        int index = 0;
        for (FlightOffer flightOffer : flightOffers) {
            if (flightOffer.getId() != id) {
                tmpFlightOffer[index] = flightOffer;
                index++;
            }
        }
        flightOffers = tmpFlightOffer;
    }
}
