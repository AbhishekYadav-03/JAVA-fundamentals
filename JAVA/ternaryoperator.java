public class ternaryoperator {
    public static void main(String[] args) {
        
        int marks = 75;

        String result = (marks >70) ? "pass": "fail";
        System.out.println(result);
// we use to remove if else staemsnt by ternasry operastion

        if(marks >70){
            System.out.println("pass");

        }else{
            System.out.println("fail");
        }
    }
}
