package ProductExample;

import expiring.NonExpiringProduct;
import shipping.Shippable;

public class TV extends NonExpiringProduct implements Shippable {
    private double weight;

    public TV(String name, int quantity, double price, double weight) {
        super(name, quantity, price);
        this.weight = weight;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}