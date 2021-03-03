
import java.util.*;  
public class PrimeWhile {
public static void main(String arg[])

{
    int id= 3;
    switch (id)
    {
    
        case 1: {
                                        
                boolean  flag= false;
                //int num = 29 ;
                int i= 2;
                Scanner s = new Scanner(System.in); 
                int num = s.nextInt();  
            
                while (i <= num/2)
                {
                    if(num %i ==0)
                    {
                        flag= true;
                    }
                    break;
                    
                }
                ++i;
                if(flag != true)
                {
                    System.out.println(num+"is prime");

                }
                else{
                    System.out.println(num+"is not prime");
                }
         }

         case 2: {




         }
    
         
        default: break;
    }
    }
    
}

