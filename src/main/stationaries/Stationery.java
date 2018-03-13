package main.stationaries;

public class Stationery implements Comparable {

    public double getPrice() {
        return 0;
    }

    public String getName() {
        return null;
    }

    @Override
    public int compareTo(Object o) {
        double comparePrice = ((Stationery)o).getPrice();
        return ((int) ((this.getPrice() - comparePrice) * 100))
                + this.getName().compareTo(((Stationery) o).getName()) * 100;
    }

    public static void main(String[] args) {
        Stationery st = new Stationery();
        Stationery st2 = new Stationery();
        st.compareTo(st2);
    }

    @Override
    public String toString() {
        return this.getPrice() + " " + this.getName();
    }
}
