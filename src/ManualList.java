import java.util.Scanner;
public class ManualList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the maximum:");
        int max = sc.nextInt();
        
    System.out.println("Odd and Evenn from 1 to " + max + ":");
        for (int i = 1; i <= max; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is Even");
            } else if (i % 5 == 0) {
                System.out.println(i + " is factor of five");
            } else {
                System.out.println(i + " is Odd");
             }
    }sc.close();
    }   

}