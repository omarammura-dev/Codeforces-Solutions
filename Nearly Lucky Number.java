import java.util.*;


public class Main {
    public static void main(String[] args) {
        int counter=0;
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        char[] c = String.valueOf(n).toCharArray();

     
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '7' || c[i] == '4')
            {
                counter++;
            }
        }
        if (counter == 7 || counter == 4)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}