//Q 1: the input number is odd or even ?
// import java.util.Scanner;
// public class condpractice {
//     public static void main(String[] args) {
        
//         Scanner scn = new Scanner(System.in);
//         System.out.print("Enter the input number: ");
//         int inp = scn.nextInt();

//         if(inp % 2 == 0) {
//             System.out.println("Even");
//         }else{
//             System.out.println("Odd");
//         }
//     }
// }

//Q2: is the valid trangle are possible or not when input angeles are taking as user input?

// import java.util.Scanner;
// public class condpractice {

//     public static void main(String[] args) {
        
//         Scanner scn = new Scanner(System.in);

//         System.out.println("enter the value of three angle: ");
//         int a = scn.nextInt();
//         int b = scn.nextInt();
//         int c = scn.nextInt();
//         int sum = a+b+c;

//         if(sum == 180 && a> 0 && b > 0 && c > 0){
//             System.out.println("Valid Triangle");
//         }else{
//             System.out.println("Invalid Triangle");
//         }
//     }
// }

//Q3:  entered year is leap year or not ? input 2014 and 2016.

// import java.util.Scanner;
// public class condpractice {

//     public static void main(String[] args) {
        
//         Scanner scn = new Scanner(System.in);

//     System.out.println("Enter the year: ");
//     int year = scn.nextInt();

//     if((year % 4 ==0) && (year % 100 != 0) || (year % 400 == 0)){
//         System.out.println("enter year is leap year: ");
//     }else{
//         System.out.println("not a leap year");
//     }
//     }
// }

//Q3: find the max number from given number as user input

import java.util.Scanner;
 public class condpractice {

     public static void main(String[] args) {
        
         Scanner scn = new Scanner(System.in);

     System.out.println("Enter the integer: ");
     int a = scn.nextInt();
     int b = scn.nextInt();
     int c = scn.nextInt();

     if(a >= b && a >= c){
        System.out.println("Number a is maximum number");

     }else if(b >= a && b >= c){
        System.out.println("Number b is maximum number");
     }else{
        System.out.println("Number c is maximum number");
     }
    }
}