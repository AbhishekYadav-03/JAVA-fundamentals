// public class amstrongNumber {
//     public static void main(String[] args) {
//         System.out.println(isAmstrong(1634));
        
//Q1:cheak for amstrog number if abc = a^n+b^n+c^n
//     }
//     public static Boolean isAmstrong(int n){

//         int nod = countDigits(n);
//         int on = n;
//         int sum = 0;

//         while(n>0){
//             int rem = n%10;
//             sum += Math.pow(rem, nod);
//             n = n / 10;
//         }

//         return sum == on;

// }

// public static int countDigits(int n){

//     int nod = 0;

//     while(n>0){
//         n = n/10;
//         nod++;
//     }
//     return nod;
// }
// }
//Q2: print armstrong number in range

public class amstrongNumber {
    public static void main(String[] args) {
        System.out.println(isAmstrong(1634));
        printAmstrongNumber(100, 500);
    }
        
       // amstrog number if abc = a^n+b^n+c^n

       public static void printAmstrongNumber(int lo, int high){

        for(int n = lo; n <=high; n++){
            boolean res = isAmstrong(n);
            if(res){
                System.out.println(n);
            }


        }
    }
    public static Boolean isAmstrong(int n){

        int nod = countDigits(n);
        int on = n;
        int sum = 0;

        while(n>0){
            int rem = n%10;
            sum += Math.pow(rem, nod);
            n = n / 10;
        }

        return sum == on;

}

public static int countDigits(int n){

    int nod = 0;

    while(n>0){
        n = n/10;
        nod++;
    }
    return nod;
}
}