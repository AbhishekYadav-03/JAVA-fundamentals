import java.util.Scanner;
public class paternproblempractice {
    public static void main(String[] args) {
        
        /*Q1: print pattern *
                            * *
                            * * *
                            * * * *
                                         */

   
      //Scanner scn = new Scanner(System.in);
      //int n = scn.nextInt();
    //      int n = 5;
    //      int trows = n;
    //      int cspace = n-1;
    //      int cstars = 1; 
    //      for(int row=1; row<=trows; row++){

    //         for(int csp = 1; csp <= cspace; csp++ ){
    //             System.out.print(" ");

    //         }
    //         for(int cst = 1; cst <= cstars; cst++ ){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //         cspace--;
    //         cstars+=2;

    //         }
// Q2:
    //         int n = 11;
    //         int trows = n;

    //         int stars = 1;

    //         for(int row = 1; row <= trows; row++){

    //             for(int cst = 1; cst <= stars; cst++){
    //                 System.out.print(cst);
    //             }
    //             // prep for next row

    //             System.out.println();
    //             if(row <= trows / 2) {
    //                 stars++;
    //             }else{
    //                 stars--;
    //             }
    //         }

    //       }

    //   }

    // Q3:

    // int n = 11;
    //         int trows = n;

    //         int number = 1;

    //         for(int row = 1; row <= trows; row++){

    //             for(int num = 1; num <= number; num++){
    //                 System.out.print(num);
    //             }

    //             // prep for next row

    //             System.out.println();
    //             if(row <= trows / 2) {
    //                 number++;
    //             }else{
    //                 number--;
    //             }
      //      }

      //Q4:
    //   
    
    // int n = 11;
    //         int trows = n;
    //         int spaces = n/2;

    //         int stars = 1;

    //         for(int row = 1; row <= trows; row++){

    //             for(int csp = 1; csp <= spaces; csp++){
    //                 System.out.print(" ");
    //             }
    //             for(int cst = 1; cst <= stars; cst++){
    //                 System.out.print("*");
    //             }
    //             // prep for next row

    //             System.out.println();
    //             if(row <= trows / 2) {
    //                 spaces--;
    //                 stars+=2;
    //             }else{
    //                 spaces++;
    //                 stars-=2;
    //             }
    //         }
    //     }
    // }

    //Q6:

    int n = 7;
            int trows = n;
            int stars = 1;
            int spaces = n-2;

            for(int row = 1; row <= trows; row++){

                for(int cst = 1; cst <= stars; cst++){
                    System.out.print("*");
                }
                for(int csp = 1; csp <= spaces; csp++){
                  System.out.print(" ");
                }
                int sstars = stars;
                if(row == trows / 2 + 1){
                  sstars = stars-1;
                }
                for(int cst = 1; cst <= sstars; cst++){
                  System.out.print("*");
              }
                // prep for next row

                System.out.println();
                if(row <= trows / 2) {
                    stars++;
                    spaces-=2;
                }else{
                    stars--;
                    spaces+=2;
                }
            }
        }
    }