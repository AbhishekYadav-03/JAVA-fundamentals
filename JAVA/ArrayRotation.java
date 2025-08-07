// public class arrayspract {
//     public static void main(String[] args) {
        
//         //Q:1--> reverse the arrays

//         int[] arr = {10, 20, 30, 40, 50};
//         display (arr);
//         reverse (arr);
//         display (arr);

//     }

//     public static void display(int[] arr){

//         for(int i = 0; i < arr.length-1; i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
//     public static void reverse(int[] arr){

//         int i = 0;
//         int j = arr.length - 1;

//         while(i<=j){
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;

//             i++;
//             j--;
//         }
//     }
// }

// 
// //Q:2--> ffind min element of array
// public class arrayspract {
//     public static void main(String[] args) {
//         int[] arr = {10, 40,3,56,78};

//         minimumEle(arr);
//     }
//     public static void minimumEle(int[] arr){

//         //int min = Integer.MAX_VALUE;
//         int min = arr[0]; 
//         for(int i = 0; i < arr.length-1; i++){
            
//             if(arr[i] < min){
//                 min = arr[i];
//             }
//         }
//         System.out.println(min);

//     }
// }
//Q:3--> find max element of array
// public class arrayspract {
//     public static void main(String[] args) {
//         int[] arr = {10, 40,3,56,78};

//         maximumEle(arr);
//     }
//     public static void maximumEle(int[] arr){

//         int max = Integer.MIN_VALUE;
//         //int max = arr[0]; 
//         for(int i = 0; i < arr.length; i++){
            
//             if(arr[i] > max){
//                 max = arr[i];
//             }
//         }
//         System.out.println(max);

//     }
// }
//Q4: rotate the given arr

// 