import java.util.*;


class Solutions {
   public static Double getCircumference(Double radius) {
       return 2 * 3.14 * radius;
   }
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      Double r = sc.nextDouble();
        Double radius = null;
      System.out.println(getCircumference(radius));
   }   
}
