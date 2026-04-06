import java.util.*;
interface PriceRule {
    double apply(double price);
}
public class fooddelivery {
    public static void main(String[] args) {
        Map<String, Double> menu = new HashMap<>();
        menu.put("Cola",  45.0);
        menu.put("Pepsi", 50.0);
        menu.put("Coke",  45.0);
        List<String> order = Arrays.asList("Cola", "Pepsi", "Coke");
        double total = 0;
        for (String item : order) {
            total += menu.getOrDefault(item, 0.0);
        }
        PriceRule addGST      = price -> price + (price * 0.05);
        PriceRule addDiscount = price -> price - (price * 0.10);
        PriceRule addDelivery = price -> (price < 500) ? price + 50 : price;
        PriceRule addService  = price -> price + (price * 0.02);
        double step1 = addGST.apply(total);
        double step2 = addDiscount.apply(step1);
        double step3 = addDelivery.apply(step2);
        double step4 = addService.apply(step3);
        System.out.println("======= FOOD BILL =======");
        System.out.println("Items Ordered  : " + order);
        System.out.println("Base Total     : " + total);
        System.out.println("After GST      : " + step1);
        System.out.println("After Discount : " + step2);
        System.out.println("After Delivery : " + step3);
        System.out.println("Final Amount   : " + step4);
        System.out.println("=========================");
    }
}