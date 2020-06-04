package ru.netology.comporator;

import ru.netology.domain.FlightOffer;

import java.util.Comparator;

public interface Comporator<F>{
   public abstract void fast (FlightOffer flightOffer);
}
