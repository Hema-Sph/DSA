//Suma and Average of the elements of the array
import java.util.Scanner;
public class array3 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       double[] num=new double[5];
       double sum=0;
       double avg=0;
       System.out.println("Enter array elements"); 

       for(int i=0;i<5;i++){
        num[i]=sc.nextDouble();
       }
       System.out.println("The Elements of the array are: ");
       for(int i=0;i<5;i++){
        System.out.println(num[i]+ " ");
       }
      for(int i=0;i<5;i++){
        sum+=num[i];
       }
      System.out.println("Sum of all elements of the array are: "+sum);
avg=sum/5;
      System.out.println("Average of all elements of the array is: "+avg);

    }
}
