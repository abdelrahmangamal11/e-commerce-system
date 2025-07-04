package ProductExample;

import expiring.NonExpiringProduct;

public class ScratchCard extends NonExpiringProduct {

    public ScratchCard(String name, int quantity, double price) {
        super(name, quantity, price);
    }
}