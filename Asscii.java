import java.util.*;  
import java.io.*;

public class Asscii {
    /*    public static void main(String[] args)
    {
        char ch= 'a';
      //  int ascii = ch;
        int castAscii = (int) ch;
       // System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);

    }
    */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); 
        char ch = sc.next().charAt(0); //read charater from user
        int castAscii = (int) ch;
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);
 

     }
}
