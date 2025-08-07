public class sqarefun {
    public static void main(String[] args) {
        
        for(int i = 1; i <= 5; i++){
            int result = getsquare(i);
            System.out.println("Square of "+ i + " is " + result);

        }
    }
    public static int getsquare(int x){
                return x * x;
    }
}