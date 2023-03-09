import java.util.ArrayList;
import java.util.Scanner;
 
 
public class Main {
    public static void main(String[] args) {
        String s,s1,lower,lower1;
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();
        s1 = scanner.nextLine();
        lower = s.toLowerCase();
        lower1 = s1.toLowerCase();
        int retval = lower.compareTo(lower1);
        if (retval < 0) {
            System.out.println("-1");
        } else if (retval == 0) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
 
    }
}