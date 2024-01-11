package day3.ecommerce;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Client client = new Client("80030", "Francesco Torre", "f.torre@gmail.com", new Date());
        Article article1 = new Article("2030", "Gold ring", 300.50f, 50);
        ShoppingCart shoppingCart = new ShoppingCart(client, new Article[]{article1}, 0);
        shoppingCart.setCartTotal(shoppingCart.getCartTotal());
        System.out.println(shoppingCart);

    }

}
