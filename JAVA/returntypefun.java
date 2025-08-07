public class returntypefun {
    public static void main(String[] args) {
        
            System.out.println("hello guys");

            //return type function
            //fun can return only one value at a time.
            int res = addnumbers(10, 50);
            System.out.println(res); 
            
            System.out.println("this is me");
            int res2 = addnumbers();
            System.out.println(res2); 

        }
        public static int addnumbers(int a, int b) {
    // body of function
            int sum = a + b;
            return sum;
        }
        public static int addnumbers() {
            int val1 = 5;
             int val2 = 6;
            // body of function
                    int sum = val1 + val2;
                    return sum;
    
    }
}