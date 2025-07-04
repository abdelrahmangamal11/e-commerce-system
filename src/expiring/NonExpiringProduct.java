package expiring;

import models.Product;

public class NonExpiringProduct extends Product {


    public NonExpiringProduct(String name, int quantity, double price) {
        super(name, quantity, price);
    }

    //    always valid
    @Override
    public boolean isValid() {
        return true;
    }




    @Override
    public String getName() {
        return name;
    }
}
