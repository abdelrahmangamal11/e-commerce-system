package ceckout;

import models.Cart;
import models.Customer;
import models.Product;
import shipping.ShippingService;

import java.util.Map;

public class CheckoutService {

    public void checkout(Customer customer, Cart cart) {
        if (cart.isEmpty()) {
            throw new IllegalStateException("models.Cart is empty");
        }

        double subtotal = 0;

        for (Map.Entry<Product, Integer> entry : cart.getItems().entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();

            if (!product.isValid()) {
                throw new IllegalStateException("models.Product expired: " + product.getName());
            }

            if (!product.isAvailable(quantity)) {
                throw new IllegalStateException("Not enough stock for: " + product.getName());
            }

            subtotal += product.getPrice() * quantity;
            product.reduceQuantity(quantity);
        }

        ShippingService shippingService = new ShippingService();
        double shipping = shippingService.ship(cart.getItems());

        double totalPaid = subtotal + shipping;

        if (customer.getBalance() < totalPaid) {
            throw new IllegalStateException("Insufficient balance.");
        }

        customer.withdraw(totalPaid);

        System.out.println();
        System.out.println("** Checkout receipt **");

        for (Map.Entry<Product, Integer> entry : cart.getItems().entrySet()) {
            Product product = entry.getKey();
            int qty = entry.getValue();
            double total = product.getPrice() * qty;
            System.out.println(qty + "x " + product.getName() + "    " + (int) total);
        }

        System.out.println("----------------------");
        System.out.println("Subtotal   " + subtotal);
        System.out.println("Shipping   "+ shipping);
        System.out.println("Total Paid   "+ totalPaid);
        System.out.println("Remaining Balance =====> "+customer.getBalance());
    }
}
