package main.stationary.drawingStationary;

public class Brush extends StationeryForDrawing {

    private double price;
    private String name;

    public Brush(double price, String name){
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
    public String draw() {
        return "drawing with brush";
    }
}
