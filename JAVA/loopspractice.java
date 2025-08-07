import java.util.Scanner;
public class loopspractice {
    public static void main(String[] args) {
        
//Q1 :a number is prime or not?
      Scanner scn = new Scanner(System.in);

      int n = scn.nextInt();
      int div = 2;
      int flag = 0;

      while(div <= n -1){
        if(n % div == 0) {
            flag = 1;
            break;
        }
        div += 1;
      }

      if(flag == 1) {
        System.out.println("not prime");
      }else{
        System.out.println("prime number");
      }


    }
}

//Q2: fint the nth number of a fabonacci series .

// import java.util.Scanner;
// public class loopspractice {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);

//        int n = scn.nextInt();

//        int a = 0;
//        int b = 1;
//        int count = 1;

//        while(count <= n +1) {
//         System.out.println(a);

//         int sum = a + b;
//         a = b;
//         b = sum;

//         count += 1;
//        }
//     }
// }

// Q3: 