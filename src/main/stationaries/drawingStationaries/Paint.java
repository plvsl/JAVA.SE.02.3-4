package main.stationaries.drawingStationaries;

public class Paint extends StationeryForDrawing {

    private double price;
    private String name;

    public Paint(double price, String name){
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
