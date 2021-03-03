import java.util.*;  
import java.io.*;
class Add{
    /*
    public static void main(String[] args)
    {
        int i=10,j=20;

        System.out.println("The value of"+i+" and "+j+ " = " +(i+j));
    }
*/
public static void main(String[] args){
    Scanner s = new Scanner(System.in); 
    System.out.println("Enter the value of I:");
    int i = s.nextInt();
    System.out.println("Enter the value of J:");
    int j = s.nextInt(); 
    System.out.println("The value of "+i+" and "+j+ " = " +(i+j));
}
}
