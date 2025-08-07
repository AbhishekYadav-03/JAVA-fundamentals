public class arrays {
    public static void main(String[] args) {
        //initialization of arrey
        int[] arr = new int[5];
        System.out.println(arr.length);//length og arrays







        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);



        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);


        //by loo
        //increasing order
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);

        }
        //decreasing order

        for(int i = arr.length-1; i >= 0; i--){
            System.out.println(arr[i]);

        }

        //enhenced for loop --> only in forforward not in backward
        //used for only reading the code not for any update

        
        System.out.println("---u-----");

        for(int val:arr){
            System.out.println(val);

        }
        // int[] arr1 = arr;
        // arr[3] = 100;
        // System.out.println(arr[3]);

        int i = 0;
        int j = 2;
        System.out.println("-----case1-----");

        System.out.println(arr[i] + ", " + arr[j]);
        Swap(arr[i] ,arr[j]);
        System.out.println(arr[i] + ", " + arr[j]);

        System.out.println("-----case2-----");

        // System.out.println(arr[i] + ", " + arr[j]);
        // swap(arr, i , j);
        // System.out.println(arr[i] + ", " + arr[j]);
    
        System.out.println("----case3---");

        int[] other = {100, 455, 78};
        System.out.println(arr[0] + ", " + other[0]);
        swap(arr, other);
        System.out.println(arr[0] + ", " + other[0]);

    }
    public static void Swap(int one , int two){
        int temp = one;
            one = two;
            two = temp;
    }
    // public static void swap(int[] a, int i, int j){
    //     int temp = a[i];
    //     a[i] = a[j];
    //     a[j] = temp;
    // }


        public static void swap(int[] one, int[] two){
            int[] temp = one;
            one = two;
            two = temp;


    }
}
