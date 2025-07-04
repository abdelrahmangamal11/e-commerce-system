import ProductExample.Biscuits;
import ProductExample.Cheese;
import ProductExample.ScratchCard;
import ceckout.CheckoutService;

public class Main {
    public static void main(String[] args) {

        //create cart instance
        models.Cart cart=new models.Cart();

        //create customer instance
        models.Customer customer=new models.Customer("abdelrahman",500000);


        // products example
        models.Product tv=new ProductExample.TV("samsung",5,1500.2,50);
        models.Product cheese =new Cheese("president",10,200,"2026-10-10",90);
        models.Product scratchcard=new ScratchCard("sim Card",30,20);
        models.Product biscuits=new Biscuits("biskrem biscuits",20,5,"2025-12-15",150);


        cart.add(tv,4);
        cart.add(cheese,6);
        cart.add(scratchcard,15);
        cart.add(biscuits,7);

        CheckoutService checkout=new CheckoutService();

        checkout.checkout(customer,cart);


    }
}