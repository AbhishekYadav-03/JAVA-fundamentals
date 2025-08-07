public class functinsdemo {
    public static void main(String[] args) {
        System.out.println("hello guys");
        //calling function
        greetingCostumers();
        System.out.println("see u soon");


        //calling function for addition by passing any values of a and b as parameter.
        addnumbers(20 , 30);  
        addnumbers(20 , 3);
        addnumbers(60 , 30);
        addnumbers(2 , 30);

    
    }

    public static void greetingCostumers() {
// body of function
        System.out.println("hello to u");
        System.out.println("hope your having good day!");

    }
    public static void addnumbers(int a, int b) {
// body of function
        int sum = a + b;
        System.out.println(sum);
    }

}