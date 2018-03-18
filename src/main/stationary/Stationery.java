package main.stationary;

public abstract class Stationery implements Comparable {

    public abstract double getPrice();
    public abstract String getName();

    @Override
    public int compareTo(Object o) {
        double comparePrice = ((Stationery)o).getPrice();
        return ((int) ((this.getPrice() - comparePrice) * 100))
                + this.getName().compareTo(((Stationery) o).getName()) * 100;
    }

    @Override
    public String toString() {
        return this.getPrice() + " " + this.getName();
    }
}
