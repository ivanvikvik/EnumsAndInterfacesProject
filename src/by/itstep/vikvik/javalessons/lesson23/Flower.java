package by.itstep.vikvik.javalessons.lesson23;

public class Flower {
    private double price;
    private ColorType color;

    public Flower() {
    }

    public Flower(double price, ColorType color) {
        this.price = price;
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public ColorType getColor() {
        return color;
    }

    public void setColor(ColorType color) {
        this.color = color;
    }

    public String toString(){
        return "price = " + price + ", color = " + color;
    }
}
