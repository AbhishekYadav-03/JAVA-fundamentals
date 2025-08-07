import java.util.ArrayList;
public class inteesectionarray {
   public static void main(String[] var0) {
      int[] var1 = new int[]{10, 19, 20, 30, 40, 40, 40, 50};
      int[] var2 = new int[]{15, 16, 17, 20, 25, 30, 30, 40};
      System.out.println(intersection(var1, var2));
   }

   public static ArrayList<Integer> intersection(int[] var1, int[] var2) {
      ArrayList<Integer> ans = new ArrayList<>();
      int i = 0;
      int j = 0;

      while(i < var1.length && j< var2.length) {
         if (var1[i] < var2[j]) {
            i++;
         } else if (var1[i] > var2[j]) {
            j++;
         } else {
            ans.add(var1[j]);
            i++;
            j++;
         }
      }

      return ans;
   }
}