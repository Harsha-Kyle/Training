import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    
    Scanner input = new Scanner(System.in);
    Double n1, n2, r;
    char o;
    System.out.println("Choose an operation: +, -, *, or /");
    o = input.next().charAt(0);

    System.out.println("Enter first number");
    n1 = input.nextDouble();

    System.out.println("Enter second number");
    n2 = input.nextDouble();

    switch (o) {

      case '+':
        r = n1 + n2;
        System.out.println(n1 + " + " + n2 + " = " + r);
        break;

      case '-':
        r = n1 - n2;
        System.out.println(n1 + " - " + n2 + " = " + r);
        break;
      case '*':
        r = n1 * n2;
        System.out.println(n1 + " * " + n2 + " = " + r);
        break;
      case '/':
        r = n1 / n2;
        System.out.println(n1 + " / " + n2 + " = " + r);
        break;

      default:
        System.out.println("Invalid o!");
        break;
    }
  }
}