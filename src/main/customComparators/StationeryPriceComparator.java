package main.customComparators;

import main.stationaries.Stationery;

import java.util.Comparator;

public class StationeryPriceComparator implements Comparator<Stationery> {

    @Override
    public int compare(Stationery o1, Stationery o2) {
        return (int) ((o1.getPrice() - o2.getPrice()) * 100);
    }
}
