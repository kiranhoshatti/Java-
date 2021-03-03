import com.sun.jdi.Value;

public class Variable {
    public static void main(String[] args) {

    int myNum = 15;
    myNum = 20;  // myNum is now 20
    System.out.println(myNum);


    //Final Variables
    //owever, you can add the final keyword if you don't want others (or yourself) to overwrite existing values (this will declare the variable as "final" or "constant", which means unchangeable and read-only):
   /* final int myValue = 15;
     myValue = 20; // will generate an error
    System.out.println(myValue);
*/ 

//Display Variable
    //ex1
    String name = "John";
    System.out.println("Hello " + name);
    //ex2
    String firstName = "John ";
    String lastName = "Doe";
    String fullName = firstName + lastName;
    System.out.println(fullName);
    //ex3
    int x = 5;
    int y = 6;
    System.out.println(x + y); // Print the value of x + y

    
    //Declare Many Variables
    int a = 5, b = 6, c = 50;
    System.out.println(a + b + c);

    //Java Identifiers
     // Good
     int minutesPerHour = 60;

     // OK, but not so easy to understand what m actually is
     int m = 60;
     
     System.out.println(minutesPerHour);
     System.out.println(m);

}
}
