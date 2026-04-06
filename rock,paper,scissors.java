import java.util.*;
public class game{
    public static void main(String[] args) {
        Scanner sr= new Scanner(System.in);
        Random rand= new Random();
        System.out.println("===Rock Paper Scissors=== ");

        while(true){
        int s=rand.nextInt(3)+1;
        System.out.println("1. Rock\n2. Paper \n3. Scissors \n4. Exit :");
        System.out.println("Enter the number : ");
        int n = sr.nextInt();
        System.out.println("Computer choice : "+s);
        if(n==s){
            System.out.println("It is Draw \n");
        }
        else if (n==4){
            System.out.println("Ok Bye");
            break;
        }
        else if (n==1 && s==3){
            System.out.println("You win\n");
        }
        else if (n==2 && s==1){
            System.out.println("You Win\n");
        }
        else if (n==3 && s==2){
            System.out.println("You Win\n");
        }
        else{
            System.out.println("You Lose \n");
        }
        }
    }
}