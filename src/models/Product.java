package models;

public abstract class Product {
    protected String name;
    protected double price;
    protected int quantity;

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isAvailable(int requestedQty) {
        return quantity >= requestedQty;
    }

    public void reduceQuantity(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
        }
    }

    public abstract boolean isValid();
}
