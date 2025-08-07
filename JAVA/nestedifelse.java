public class nestedifelse {
    public static void main(String[] args) {


        String movie = " line of duty ";

        boolean primeSubs = true;
        boolean acorn = false;
        boolean amc = true;

        if(primeSubs){
            if(acorn || amc){
                System.out.println("yes, you can watch it.Enjoy" + movie);
            }else{
                System.out.println("we recomand to buy acorn or amc to enjoy it");
            }
        }else{
            System.out.println("cant watch movie,why dont you take primesubs");
                }
            }
    }