import java.util.*;  
import java.io.*;
public class Floatmultiplaction {
    /*
    public static void main(String[] args)
    {
        float i= 10.2f, j = 9.8f;
        float m= i*j;
        System.out.println("The value of"+i+" and "+j+ " = " +m);
    }
    */
    public static void main(String[] args){
        Scanner s = new Scanner(System.in); 
        System.out.println("Enter the value of I:");
        float i = s.nextFloat();
        System.out.println("Enter the value of J:");
        float j = s.nextFloat(); 
        float m= (float)i*(float)j;
        System.out.println("The value of"+i+" and "+j+ " = " +m);
    }
}
