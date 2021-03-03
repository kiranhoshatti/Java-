
import java.util.*;  
public class Primefor {
public static void main(String arg[])
{
    Scanner s = new Scanner(System.in); 
    int num = s.nextInt();  
    boolean  flag= false;
    for(int i=2;i< num/2; ++i)
    {
        if(num%i==0)
        {
            flag= true;
        }
        break;
        
    }
    if(flag != true)
    {
        System.out.println(num+"is prime");

    }
    else{
        System.out.println(num+"is not prime");
    }
}

}
