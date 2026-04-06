import java.util.*;
interface PriceRule {
    double apply(double price);
}
public class furniturestore{
    public static void main(String[] args) {
        Map<String, Double> catalog = new HashMap<>();
        catalog.put("Chair",    1500.0);
        catalog.put("Table",    4500.0);
        catalog.put("Shelf",    2200.0);
        catalog.put("Sofa",     8500.0);
        catalog.put("Wardrobe", 9200.0);
        catalog.put("Bed",      7500.0);
        Map<String, Integer> quantity = new HashMap<>();
        quantity.put("Chair",    2);
        quantity.put("Table",    1);
        quantity.put("Shelf",    3);
        quantity.put("Sofa",     1);
        quantity.put("Wardrobe", 1);
        quantity.put("Bed",      1);
        List<String> order = Arrays.asList("Chair", "Table", "Shelf", "Sofa", "Wardrobe", "Bed");
        double total = 0;
        for (String item : order) {
            total += catalog.getOrDefault(item, 0.0) * quantity.getOrDefault(item, 1);
        }
        PriceRule addGST      = price -> price + (price * 0.18);
        PriceRule addDiscount = price -> price - (price * 0.10);
        PriceRule addDelivery = price -> (price < 10000) ? price + 500 : price;
        PriceRule addService  = price -> price + (price * 0.02);
        double step1 = addGST.apply(total);
        double step2 = addDiscount.apply(step1);
        double step3 = addDelivery.apply(step2);
        double step4 = addService.apply(step3);
        System.out.println("===== FURNITURE BILL =====");
        for (String item : order) {
            int qty   = quantity.getOrDefault(item, 1);
            double price = catalog.getOrDefault(item, 0.0);
            System.out.println(item + " x" + qty + " = " + (price * qty));
        }
        System.out.println("--------------------------");
        System.out.println("Base Total     : " + total);
        System.out.println("After GST(18%) : " + step1);
        System.out.println("After Discount : " + step2);
        System.out.println("After Delivery : " + step3);
        System.out.println("Final Amount   : " + step4);
        System.out.println("==========================");
    }
}