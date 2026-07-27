//Adding values into a 1D array and printing them one by one
import java.util.Scanner;
public class array2{
    public static void main(String[] args) {
        int[] num= new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 numbers:");

        for(int i=0;i<5;i++){
            num[i]=sc.nextInt();
        }

        System.out.print("The numbers are: ");

        for(int i=0;i<5;i++){
            System.out.println(num[i]+" ");
        }
        sc.close();
    }
}
