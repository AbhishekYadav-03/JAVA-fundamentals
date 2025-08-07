import java.util.Scanner;
public class inputoutput {
    public static void main(String[] args) {
    //     System.out.println("hello");

    //    int val = 10;
    //    System.out.println(val);
    //    System.out.println(5);

//concatination in java 
    //    System.out.println("I am " + "a good looking boy");
    //    System.out.println("Number" + "val");

    //create an object of scanner class

       Scanner in = new Scanner(System.in);
    
       System.out.print("Enter the value: ");

//take input from user
       int num = in.nextInt();

       System.out.println(" You entered " + num);


    }
}