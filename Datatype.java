class Datatype
{
    public static void main(String [] args)
    {
        int myNum = 5;               // integer (whole number)
        float myFloatNum = 5.99f;    // floating point number
        char myLetter = 'D';         // character
        boolean myBool = true;       // boolean
        String myText = "Hello";     // String    
        System.out.println(myNum);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);

        //Integer Type
            //Byte The byte data type can store whole numbers from -128 to 127.
            byte Byte = 100;
            System.out.println(Byte);  
            
            //Short The short data type can store whole numbers from -32768 to 32767:
            short Short = 5000;
            System.out.println(Short);

            //Int The int data type can store whole numbers from -2147483648 to 2147483647
            int Int = 100000;
            System.out.println(Int);   

            //Long The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807
            // Note that you should end the value with an "L":
            long Long = 15000000000L;
            System.out.println(Long);
        
        //Float The float data type can store fractional numbers from 3.4e−038 to 3.4e+038. Note that you should end the value with an "f"
        float Float = 5.75f;
        System.out.println(Float);

        //Double The double data type can store fractional numbers from 1.7e−308 to 1.7e+308. Note that you should end the value with a "d":
        double Double = 19.99d;
        System.out.println(Double);

       // Scientific Numbers
       //A floating point number can also be a scientific number with an "e" to indicate the power of 10:
        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);

        //Booleans
        //A boolean data type is declared with the boolean keyword and can only take the values true or false:
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isFishTasty);   // Outputs false

        //Characters
       // The char data type is used to store a single character. The character must be surrounded by single quotes, like 'A' or 'c':
       char myGrade = 'B';
       System.out.println(myGrade);

       //alternative
       char a = 65, b = 66, c = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //Strings
        //The String data type is used to store a sequence of characters (text). String values must be surrounded by double quotes:
        String greeting = "Hello World";
        System.out.println(greeting);
    }
}