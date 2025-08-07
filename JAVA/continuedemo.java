// public class continuedemo {
//     public static void main(String[] args) {
        
//         for(int i = 1; i<=10; i++) {
//             if(i >= 4 && i < 9) {
//                 continue;

//         }
//         System.out.println(i);
//     }

// }
// }

//Q1: 

public class continuedemo {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        while(i <= 3){
            System.out.println("outer loop" + i);
            
            while(j <=3){
                if(j==2){
                    j++;
                    continue;
                }
                System.out.println("inner loop" + j);
                j++;
        }
        i++;

    }
}
}