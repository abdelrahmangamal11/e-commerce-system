package ProductExample;

import expiring.ExpiringProduct;
import shipping.Shippable;

public class Biscuits extends ExpiringProduct implements Shippable {

    private double weight;
    public Biscuits(String name, int quantity, double price, String expiryDate, double weight) {
        super(name, quantity, price, expiryDate);
        this.weight=weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
