import java.util.*;


public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String that = "that";
        String it = "it";
        for (int i = 1; i < n+1; i++) {
            if (i % 2 == 1 || i == 1)
                 if (i==n)
                    System.out.print("I hate "+it+" ");
                else
                    System.out.print("I hate "+that+" ");
            else if (i % 2 == 0)
                    if (i==n)
                        System.out.print("I love "+it+" ");
                    else
                        System.out.print("I love "+that+" ");
        }


    }
}