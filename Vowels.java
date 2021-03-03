import java.util.*;  
import java.io.*;

public class Vowels {
    /*
    public static void main(String[] args)
    {
        char ch = 'A';
        if(ch=='A' || ch== 'E'|| ch== 'I'|| ch== 'O'||ch== 'U')
       //if(ch='A' OR ch= 'E'OR ch= 'I 'OR ch= 'O'OR ch= 'U')
        {
            System.out.println("Its an vowels");
        }
        else{
            System.out.println("Its not an vowels");
        }
    }
        */
    
        /*
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in); 
            System.out.println("Ente the charater whether chick its an Vowels or Not");
            char ch = sc.next().charAt(0);
            if(ch=='A' || ch== 'E'|| ch== 'I'|| ch== 'O'||ch== 'U'||ch=='a' || ch== 'e'|| ch== 'i'|| ch== 'o'||ch== 'u')
           //if(ch='A' OR ch= 'E'OR ch= 'I 'OR ch= 'O'OR ch= 'U')
            {
                System.out.println("Its an vowels");
            }
            else{
                System.out.println("Its not an vowels");
            }
        }
*/

public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in); 
            System.out.println("Ente the charater whether chick its an Vowels or Not");
            char ch = sc.next().charAt(0);
           switch(ch){
               case 'a' :
               case 'e' :
               case 'i' :
               case 'o' :
               case 'u' :
               case 'A' :
               case 'E' :
               case 'I' :
               case 'O' :
               case 'U' :
               System.out.println("Its an vowels");
               default: System.out.println("Its not  an vowels");
               break;

               
               
           }
        }


}
