import java.util.*;  
import java.io.*;

public class Leap {
    public static void main(String[] args)
    {
        boolean leap = false;
        // if the year is divided by 4
        System.out.println("Enter the year to check whether its LEAr or NOT");
        Scanner sc = new Scanner(System.in);
        int year =sc.nextInt();
        if(year%4 ==0)
        {
            if(year%100 ==0)
            {// if year is divided by 400
              // then it is a leap year
                if(year%400 ==0)
                   leap= true;
                 else
                  leap=false;
                
            }
            else
            leap=true;
        }
        else
        leap=false;
    
    if(leap)
    {
        System.out.println(year+" its leap year ");

    }
    else{
        System.out.println(year+" its not leap year ");

    }

}
}
