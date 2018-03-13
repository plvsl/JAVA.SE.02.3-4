package main.stationaries.writingStationaries;

public class Pen extends StationeryForWriting {

    private double price;
    private String name;

    public Pen(double price, String name){
        this.name = name;
        this.price = price;
    }
    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public String getName() {
        return name;
    }
}
