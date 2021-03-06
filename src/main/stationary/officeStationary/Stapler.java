package main.stationary.officeStationary;

public class Stapler extends OfficeStationary {

    private double price;
    private String name;

    public Stapler(double price, String name){
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
        return "staple";
    }
}
