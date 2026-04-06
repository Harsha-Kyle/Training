interface payment{
    void pay();
}
class Gpay implements payment{
    public void pay(){
        System.out.println("GPay payment");
    }
}
class PhonePe implements payment{
    public void pay(){
        System.out.println("PhonePe payment");
    }
}
public class InterfacePay{
    public static void main(String[] args) {
        payment p;
        p=new Gpay();
        p.pay();
        p=new PhonePe();
        p.pay();
    }
}