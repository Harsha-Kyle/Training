import java.util.Scanner;

public class main {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);

 System.out.print("Enter a number \n 1.Area of the rectangle \n 2.Area of triangle \n 3.Area of the square \n 4.Eligibility to vote  \n 5.Odd or Even : ");
 int op = input.nextInt();
 switch(op) {
    case 1:
        System.out.print("Enter a length: ");
        int l = input.nextInt();
        System.out.print("Enter a breadth: ");
        int b = input.nextInt();
        System.out.println("Area of the rectangle = "+l*b);
        break;
    case 2:
        System.out.print("Enter a length: ");
        int s = input.nextInt();
        System.out.print("Enter a breadth: ");
        int t = input.nextInt();
        System.out.println("Area of the triangle = "+0.5*s*t);
        break;
    case 3:
        System.out.print("Enter a side: ");
        int a = input.nextInt();
        System.out.println("Area of the square = "+a*a);
        break;
    case 4:
        System.out.print("Enter Your age: ");
        int age = input.nextInt();
        if(age>=18){
        System.out.println("Eligible to vote ");
        }
        else{
        System.out.println("Not Eligible to vote ");

        }
        break;
    case 5:
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        if(n%2==0){
        System.out.println(n+" is Even number ");
        }
        else{
        System.out.println(n+" is Odd number ");
        }
        break;
     default:{
        System.out.println("Invalid choice");
    }
  }
 }
}