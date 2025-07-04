package shipping;

import models.Product;

import java.util.Map;

public class ShippingService {
    public double ship(Map<Product, Integer> items) {
        System.out.println("** Shipment notice **");

        double totalWeight = 0;

        for (Map.Entry<Product, Integer> entry : items.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();

            if (product instanceof Shippable) {
                String unit;

                Shippable shippable = (Shippable) product;
                double weight = shippable.getWeight() * quantity;
                totalWeight += weight;
                //  assume that the input always be in grams
                System.out.println(quantity + "x " + shippable.getName()+"   "+weight+"g");
            }
        }


        System.out.println("Total package weight "+ totalWeight/1000+"kg");
        //assume that the shepping will cost 100 for eah 1kg
        double shippingFees = (totalWeight/1000) * 150;
        return shippingFees;
    }
}
