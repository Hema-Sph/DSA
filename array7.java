//Finding Maximum and Minimum number from an array
import java.util.Scanner;
public class array7 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[4];
    
    System.out.println("Enter numbers into the array: ");
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    int max=arr[0];
    int min=arr[0];
    for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
        if(arr[i]<min){
            min=arr[i];
        }
    }
    System.out.println("Maximum number from the array is "+max);
    System.out.println("Minimum number from the array is "+min);
      
   sc.close();
   }
}
   

