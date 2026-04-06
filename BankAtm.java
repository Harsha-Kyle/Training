import java.util.*;



class BankAtm{
    public void withdraw(int b) {
       System.out.print("Enter withdraw amount: ");
               Scanner sc = new Scanner(System.in);

                         int w = sc.nextInt();

                        if (w <= b) {
                            b -= w;
                            System.out.println("Balance = " + b);
                        } else {
                            System.out.println("Insufficient Balance");
                        }
    }
    public void deposit(int b) {
                       Scanner sc = new Scanner(System.in);
                     System.out.print("Enter deposit amount: ");
                        int d = sc.nextInt();
                        b += d;
                        System.out.println("Balance = " + b);
    }

    public static void main(String[] args) {
        BankAtm atm = new BankAtm(); 
        System.out.print("Enter ATM PIN: ");
        Scanner sc = new Scanner(System.in);
        int b = 10000;
        int p = 1234;
        int e = sc.nextInt();
        int c=0;
        while(true){
        if (e == p){
            System.out.println("\n1.Withdraw");
                System.out.println("2.Deposit");
                System.out.println("3.Check Balance");
                System.out.println("4.Exit");

                System.out.print("Enter choice: ");
                c = sc.nextInt();
        }
        else {
            System.out.println("Incorrect PIN");
        }
        if (c==1){
                  atm.withdraw(b);
        }
        else if(c==2){
                  atm.deposit(b);
        }
        else if(c==2){
        System.out.println("Balance = " + b);
        }
        else{
        System.out.println("Invalid Choice");
        }
    }
    }
}
    
