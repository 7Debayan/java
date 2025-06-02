import java.util.*;
class reportcardgrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Want to continue ? (yes(1) or no(0))");
        int i = sc.nextInt();
        do {
            i = i+2;
            System.out.println("thank you");
        }while (i == 0);
        do { 
            int marks = sc.nextInt();
            if (marks<=100 && marks >=90) {
                System.out.println("This is good");
            }else if (marks<90 && marks>=60) {
                System.out.println("This is also good");                
            }else if(marks<60 && marks>=0){
                System.out.println("This is good as well");
            }else{
                System.out.println("This is invalid");
            }
        } while (i == 1);
    }    
}
