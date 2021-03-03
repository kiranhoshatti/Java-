import java.util.*;  
import java.io.*;


public class Swap {
    /*
    public static void main(String[] arg){

        int temp,a=10,b=20;

        System.out.println("the original value is a= "+a+ " b ="+b);

        temp=a;
        a=b;
        b=temp;

        System.out.println("the Swapping value is a= "+a+ " b ="+b);

    }
*/

public static void main(String[] arg){

    Scanner sc= new Scanner(System.in);

    System.out.println("Enter the value of A");
    float a = sc.nextFloat();
    System.out.println("Enter the value of B");
    float b = sc.nextFloat();

    System.out.println("the original value is a= "+a+ " b ="+b);

    float temp=a;
    a=b;
    b=temp;

    System.out.println("the Swapping value is a= "+a+ " b ="+b);

    
}

/*

public static void main(String[] arg){

    Scanner sc= new Scanner(System.in);

    System.out.println("Enter the value of A");
    char a = sc.next().charAt(0); 
    System.out.println("Enter the value of B");
    char b = sc.next().charAt(0); 

    System.out.println("the original value is a= "+a+ " b ="+b);

   char temp=a;
    a=b;
    b=temp;

    System.out.println("the Swapping value is a= "+a+ " b ="+b);

    
}

*/
    
}
