package skeleton;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dineshraj on 04/04/2014.
 */
public class Checkout {
    private final Map<String, Integer> productPrices = new HashMap<String, Integer>();
    private int total = 0;

    public void setPrices(Map products) {
        productPrices.putAll(products);
    }

    public void updateTotal(String product, int quantity) {
        this.total += productPrices.get(product) * quantity;
    }

    public int getTotal() {
        return this.total;
    }
}
