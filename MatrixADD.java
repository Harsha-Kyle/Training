import java.util.*;

public class Add{
    public static void main(String[] args) {
        int [][] a={
            {1,2,3}, //0
            {4,5,6}, //1
            {7,8,9}, //2
        };
        int [][] b={
            {1,2,3}, //0
            {4,5,6}, //1
            {7,8,9}, //2
        };

        for(int i=0;i<a.length;i++){
                for(int j=0;j<a[i].length;j++){
            System.out.print(a[i][j]+b[i][j]+" ");                    
                }
            System.out.println(" ");

            }
    }
}