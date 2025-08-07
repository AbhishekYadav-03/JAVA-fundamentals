//allows us to creat resisable arrays,dinamic arrays
import java.util.ArrayList;

public class arralist {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<String> languages = new ArrayList<>();

        //add element
        languages.add("java");
        languages.add("javascript");
        languages.add("Swift");

        // for  add element 
        languages.add(1, "c++");
        
        System.out.println(languages);


    //access element
    String str = languages.get(1);
    System.out.println(str);

    //change

    languages.set(1,"c++");
    System.out.println(languages);

    // remove
    System.out.println(languages.size());
    languages.remove(2);
    System.out.println(languages);
    System.out.println(languages.size());

    //iteratin

    for(String language : languages){
        System.out.println(language);
    }
    }

}