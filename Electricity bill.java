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
                    System.out.println("Welcome to electricity bill generator\n\n\n");
                while (true) {
                    System.out.print("Enter a number \n 1.View details \n 2.Calculate your bill \n 3.Exit :");
                     int op = sr.nextInt();
                     int l=0;
                     switch(op) {
                      case 1:
                          System.out.println("0 to 100 units = 2 per unit\n101 to 200 units = 3 per unit\n200+ units = 5 per unit\n \n  \n   ");
                            break;
                     case 2:
                           System.out.println("Enter your units : ");
                            int e=sr.nextInt();
                            int s=0;
                            for(int i=0;i<3;i++){
                            if(i==0){
                            if(e>0 && e<=100){
                                
                                s+=e*2;
                                break;
                            }
                            else{
                                s+=100*2;
                                e=e-100;
                            }
                            }
                            if(i==1){
                            if(e>0 && e<=100){
                                s+=e*3;
                                break;
                            }
                            else{
                                s+=100*3;
                                e=e-100;
                                
                            }
                            }
                            if(i==2){
                                s+=e*5;
                                break;
                            }
                            
                            }
                              
                            System.out.println("The Bill : "+s+"\n \n  \n   ");
                            break;
                    case 3:
                    System.out.println("Thank you\nlogging out \n \n  \n   ");
                    l=1;
                    break;
      

                
                       default:{
                            System.out.println("Invalid choice");
                      }
                    
                    
                
                }
                if(l==1){
                        break;
                    }
                }
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
}}