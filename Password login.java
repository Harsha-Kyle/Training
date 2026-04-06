import java.util.*;

public class main{
    public static void main(String[] args) {
        {
            Scanner sr= new Scanner(System.in);
            String u="Harsha kyle";
            String p="12345";
            int t=3;
            while (true) { 
                System.out.println("Enter the username : ");
                String a= sr.nextLine();
                System.out.println("Enter the psaaword : ");
                String b= sr.nextLine();
                if(a.equals(u) && b.equals(p)){
                    System.out.println("Welcome!!!");
                    break;
                }
                else{
                    System.out.println("Username or password Incorrect");
                    t--;
                }
                if(t==0){
                    System.out.println("Multiple incorrect tries \nContact admin");
                    break;
                }
            } 
        }
    }
}