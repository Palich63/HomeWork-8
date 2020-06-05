package ru.netology.manager;

import lombok.AllArgsConstructor;
import ru.netology.domain.FlightOffer;
import ru.netology.repository.FlightOfferRepository;

import java.util.Arrays;
import java.util.Comparator;

@AllArgsConstructor
public class FlightOfferManager {

    private FlightOfferRepository repository = new FlightOfferRepository();

    public FlightOfferManager() {

    }

    //Метод ищит билеты по полям ARRIVAL и DEPARTURE, и дополнительно в конце сортирует по увеличению
    public FlightOffer[] searchBy(String searchArrival, String searchDeparture, Comparator<FlightOffer> comparator) {
        FlightOffer[] result = new FlightOffer[0];
        for (FlightOffer flightOffer : repository.findAll()) {
            if (flightOffer.matchesArrival(searchArrival) && flightOffer.matchesDeparture(searchDeparture)) {
                FlightOffer[] tmpFlightOffer = new FlightOffer[result.length + 1];
                System.arraycopy(result, 0, tmpFlightOffer, 0, result.length);
                tmpFlightOffer[tmpFlightOffer.length - 1] = flightOffer;
                result = tmpFlightOffer;
            }
        }
        Arrays.sort(result, comparator);
        return result;
    }

    public void flightAdd(FlightOffer ticket) {
        repository.save(ticket);
    }
}
