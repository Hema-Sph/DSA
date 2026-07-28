//Sum of two 2D arrays
import java.util.Scanner;
public class array5 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
     int[][] mat1=new int[3][3];
     int[][] mat2=new int[3][3];
     int[][] sum=new int[3][3];
    // 1st array
    System.out.println("Enter elements of the 1st array:");
    for(int i = 0; i < 3; i++){     
        for(int j = 0; j < 3; j++){         
            mat1[i][j] =sc.nextInt();     
        }
    }
    //2nd array
    System.out.println("Enter elements of the 2nd array:");
    for(int i = 0; i < 3; i++){     
        for(int j = 0; j < 3; j++){         
            mat2[i][j] =sc.nextInt();     
        } 
    }
     //Summing up the 2 2D arrays together
     for(int i = 0; i < 3; i++){     
        for(int j = 0; j < 3; j++){         
            sum[i][j] =mat1[i][j]+mat2[i][j];     
        } 
    }  
    //Printing the Sum array
    for(int i = 0; i < 3; i++){     
        for(int j = 0; j < 3; j++){         
            System.out.print( sum[i][j]+" ");
                       } 
            System.out.println();}  
    
    sc.close();}
}
