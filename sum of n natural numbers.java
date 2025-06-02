
import java.util.Scanner;

 class sumofnnaturalnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int k = 0;
        for (int j = 1; j<= i; j++){
            k = k+j;
        }
        System.out.println(k);
    }
    
}
