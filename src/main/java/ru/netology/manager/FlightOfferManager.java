package ru.netology.manager;

import lombok.AllArgsConstructor;
import ru.netology.domain.FlightOffer;
import ru.netology.repository.FlightOfferRepository;

@AllArgsConstructor
public class FlightOfferManager {

    private FlightOfferRepository repository = new FlightOfferRepository();

    public FlightOfferManager() {

    }

    public FlightOffer[] searchBy(String searchArrival, String searchDeparture) {
        FlightOffer[] result = new FlightOffer[0];
        for (FlightOffer flightOffer : repository.findAll()) {
            if (flightOffer.matchesArrival(searchArrival) && flightOffer.matchesDeparture(searchDeparture)) {
                FlightOffer[] tmpFlightOffer = new FlightOffer[result.length + 1];
                System.arraycopy(result, 0, tmpFlightOffer, 0, result.length);
                tmpFlightOffer[tmpFlightOffer.length - 1] = flightOffer;
                result = tmpFlightOffer;
            }
        }
        return result;
    }

    public void flightAdd(FlightOffer ticket) {
        repository.save(ticket);
    }

    public FlightOffer[] allFlight(){
        return repository.findAll();
    }
}
