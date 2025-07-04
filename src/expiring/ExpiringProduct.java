package expiring;

import models.Product;

import java.time.LocalDate;

public class ExpiringProduct extends Product {
    private LocalDate expiryDate;


    public ExpiringProduct(String name, int quantity, double price, String expiryDate ) {
        super(name, quantity, price);
        this.expiryDate = LocalDate.parse(expiryDate);
    }

    @Override
    public boolean isValid() {
        return LocalDate.now().isBefore(expiryDate);
    }


    @Override
    public String getName() {
        return name;
    }


}
