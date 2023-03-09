import java.util.*;


public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();
        int a,b;
        for (int i = 0; i < testcases; i++) {
            a= scanner.nextInt();
            b= scanner.nextInt();

            if (a%b == 0)
                System.out.println("0");
            else
                System.out.println(b-(a%b));
        }

    }
}