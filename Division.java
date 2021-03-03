import java.util.*;  
import java.io.*;

public class Division {
    public static void main(String arg[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Diviser");
        float divisor = sc.nextFloat();
        System.out.println("Enter the Divider");
        float divider = sc.nextFloat();

        float Quation = divisor / divider;
        System.out.println("the value og Quation is " +Quation);

        float Remmender = divisor % divider;
        System.out.println("the value og Remmender is " +Remmender);
    }
}
