public class SmartPayment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Cash");
    }

    void pay(double amount, String cardType) {
        System.out.println("Paid " + amount + " using " + cardType + " Card");
    }
    void pay(String upiId, double amount) {
        System.out.println("Paid " + amount + " using UPI ID: " + upiId);
    }
    void pay(double amount, int months) {
        double emi = amount / months;
        System.out.println("Paid " + amount + " in " + months + " months EMI");
        System.out.println("Monthly EMI: " + emi);
    }
    public static void main(String[] args) {
        SmartPayment sp = new SmartPayment();

        sp.pay(500);                        
        sp.pay(2000, "Debit");               
        sp.pay("harsha@upi", 1500);            
        sp.pay(10000, 5);                    
    }
}