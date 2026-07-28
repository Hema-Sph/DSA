//Creating an array of names and Searching a given name in it
import java.util.Scanner;
public class array6 {
    public static void main(String[] args) {
       String[] names=new String[4];
       Scanner sc=new Scanner(System.in);
       boolean found=false;
        
       System.out.println("Enter names into the array: ");
        
       for(int i=0;i<4;i++){
        names[i]=sc.nextLine();
       } 
       System.out.println("Enter the name to be searched: ");
       String a=sc.nextLine();
    
       for(int i=0;i<4;i++){
            if(names[i].equals(a)){
                found=true;
                break;
             }
        }
        if(found){
            System.out.println(a+" is in the array");
        }
        
        else{
             System.out.println(a+" is not in the array");
        }
       sc.close();
    }
}


