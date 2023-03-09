import java.util.Scanner;
 
 
 
public class Main {
    public static void main(String[] args) {
 
        String colors;
        int n;
        int n_of_removes = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        colors = scanner.next();
        char[] chars = colors.toCharArray();
 
        for (int i = 0; i < chars.length-1; i++) {
                if (chars[i] == chars[i+1])
                {
                    n_of_removes++;
                }
            }
 
        System.out.println(n_of_removes);
    }
}