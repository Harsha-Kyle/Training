import java.util.*;

public class main {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);

 System.out.print("Enter your Name : ");
 String n = input.nextLine();
 System.out.print("Enter your Mail : ");
 String m = input.nextLine();
 System.out.print("Enter your number : ");
 String c = input.nextLine();
 String y ="yes";
while (y=="yes"){

if(n.isEmpty()){
        System.out.println("Name cannot be empty ");
        }
        else if(!m.contains("@")){
        System.out.println("Invalid email ");
        }

 System.out.print("Enter a number \n 1.View details \n 2.Change/update Name \n 3.Change/update Mail  \n 4.Change/update Number: ");
 int op = input.nextInt();

 switch(op) {
    case 1:
        System.out.println("Name : "+n);
        System.out.println("Mail : "+m);
        System.out.println("Number = "+c);
        break;
    case 2:
        System.out.println("Enter your Name to update: ");
        n = input.nextLine();
        System.out.println("Name has been updated to "+n);
        break;
    case 3:
        System.out.println("Enter your Mail to update: ");
        m = input.nextLine();
        System.out.println("Mail has been updated to "+m);
        break;
    case 4:
        System.out.println("Enter your Number to update: ");
        c = input.nextLine();
        System.out.println("Number has been updated to "+c);
        break;
    
     default:{
        System.out.println("Invalid choice");
    }
  }
    System.out.println("Do you want to continue then type 'yes': ");
    y = input.nextLine();
  
}
  }
}