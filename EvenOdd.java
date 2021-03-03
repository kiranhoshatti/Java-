import java.util.*;  
import java.io.*;


public class EvenOdd {
    /*
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value let find out whether given value is ODD or EVEN");

        float value = sc.nextFloat();

        if(value%2 ==0)
        {
            System.out.println("Its is EVEN");
        }
        else
    {
        System.out.println("Its is ODD");
    }

    }
    */

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        String evenOdd = (num % 2 == 0) ? "even" : "odd";

        System.out.println(num + " is " + evenOdd);

    }
}
