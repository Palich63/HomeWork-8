package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.comporator.TimeFlightComparator;
import ru.netology.comporator.TimeFlightComporator;
import ru.netology.domain.FlightOffer;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FlightOfferManagerTest {

    private FlightOfferManager flightOfferManager = new FlightOfferManager();
//    private Comparator<TimeFlightComparator> Comparator;

    private FlightOffer ticket1 = new FlightOffer(1, 4530, "BRU", "SVO", 315);
    private FlightOffer ticket2 = new FlightOffer(2, 6540, "BRU", "MAD", 124);
    private FlightOffer ticket3 = new FlightOffer(3, 13700, "SVO", "MAD", 240);
    private FlightOffer ticket4 = new FlightOffer(4, 3090, "CDG", "MLA", 156);
    private FlightOffer ticket5 = new FlightOffer(5, 27776, "BRU", "SVO", 315);
    private FlightOffer ticket6 = new FlightOffer(6, 43776, "BRU", "SVO", 561);
    private FlightOffer ticket7 = new FlightOffer(7, 3441, "MLA", "BUD", 90);
    private FlightOffer ticket8 = new FlightOffer(8, 2560, "BRU", "SVO", 211);
    private FlightOffer ticket9 = new FlightOffer(9, 27776, "BRU", "SVO", 211);


    @Test
    void shouldSearchFlightFastest() {
        flightOfferManager.flightAdd(ticket1);
        flightOfferManager.flightAdd(ticket2);
        flightOfferManager.flightAdd(ticket3);
        flightOfferManager.flightAdd(ticket4);
        flightOfferManager.flightAdd(ticket5);
        flightOfferManager.flightAdd(ticket6);
        flightOfferManager.flightAdd(ticket7);
        flightOfferManager.flightAdd(ticket8);

        FlightOffer[] actual = new FlightOffer[]{ticket8, ticket1, ticket5, ticket6};
        FlightOffer[] expected = flightOfferManager.searchBy("BRU", "SVO", Comparator<TimeFlightComparator> Comparator);

        assertArrayEquals(actual, expected);
    }
//    //Тест на поиск и сортировку
//    @Test
//    void shouldSearchFlight() {
//        flightOfferManager.flightAdd(ticket1);
//        flightOfferManager.flightAdd(ticket2);
//        flightOfferManager.flightAdd(ticket3);
//        flightOfferManager.flightAdd(ticket4);
//        flightOfferManager.flightAdd(ticket5);
//        flightOfferManager.flightAdd(ticket6);
//        flightOfferManager.flightAdd(ticket7);
//        flightOfferManager.flightAdd(ticket8);
//
//        FlightOffer[] actual = new FlightOffer[]{ticket8, ticket1, ticket5, ticket6};
//        FlightOffer[] expected = flightOfferManager.searchBy("BRU", "SVO");
//
//        assertArrayEquals(actual, expected);
//    }
//
//    //Тест когда ни один элемент не удовлетворяет критерию поиска.
//    @Test
//    void shouldSearchNothingFlight() {
//        flightOfferManager.flightAdd(ticket2);
//        flightOfferManager.flightAdd(ticket3);
//        flightOfferManager.flightAdd(ticket4);
//        flightOfferManager.flightAdd(ticket7);
//
//        FlightOffer[] actual = new FlightOffer[]{};
//        FlightOffer[] expected = flightOfferManager.searchBy("BRU", "SVO");
//
//        assertArrayEquals(actual, expected);
//    }
//
//    //Тест когда критерию поиска удовлетворяет только один элемент
//    @Test
//    void shouldSearchOneFlight() {
//        flightOfferManager.flightAdd(ticket2);
//        flightOfferManager.flightAdd(ticket3);
//        flightOfferManager.flightAdd(ticket4);
//        flightOfferManager.flightAdd(ticket7);
//        flightOfferManager.flightAdd(ticket8);
//
//        FlightOffer[] actual = new FlightOffer[]{ticket8};
//        FlightOffer[] expected = flightOfferManager.searchBy("BRU", "SVO");
//
//        assertArrayEquals(actual, expected);
//    }
//
//    //Тест когда имеется два элемента с одинаковыми значениями
//    @Test
//    void shouldSearchFlightSimilar() {
//        flightOfferManager.flightAdd(ticket1);
//        flightOfferManager.flightAdd(ticket2);
//        flightOfferManager.flightAdd(ticket3);
//        flightOfferManager.flightAdd(ticket4);
//        flightOfferManager.flightAdd(ticket5);
//        flightOfferManager.flightAdd(ticket6);
//        flightOfferManager.flightAdd(ticket7);
//        flightOfferManager.flightAdd(ticket8);
//        flightOfferManager.flightAdd(ticket9);
//
//        FlightOffer[] actual = new FlightOffer[]{ticket8, ticket1, ticket5, ticket9, ticket6};
//        FlightOffer[] expected = flightOfferManager.searchBy("BRU", "SVO");
//
//        assertArrayEquals(actual, expected);
//    }
}