package main.stationary.officeStationary;

public class Puncher extends OfficeStationary {

    private double price;
    private String name;

    public Puncher(double price, String name){
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

    @Override
    public String attach() {
        return "clip";
    }
}
