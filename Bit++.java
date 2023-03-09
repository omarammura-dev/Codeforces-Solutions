import java.util.Scanner;
 
 
public class Main {
    public static void main(String[] args) {
        String statements;
        int X = 0;
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 0; i<n;i++)
        {
            statements = scanner.next();
            if (statements.equals("++X")  ||statements.equals("X++") )
            {
                X++;
            } else if (statements.equals("--X")  ||statements.equals("X--")) {
                X--;
            }
        }
        System.out.println(X);
     
    }
}