package day3.ecommerce;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class ShoppingCart {
    private Client client;
    private Article[] items;
    private float cartTotal;

    public float getCartTotal() {
        float total = 0;
        for (int i = 0; i < items.length; i++) {
            total += items[i].getPrice();

        }
        return total;

    }

}

