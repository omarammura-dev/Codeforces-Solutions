import java.util.Scanner;
 
 
public class Main {
    public static void main(String[] args) {
   
 
        int p,v,t;
        int n;
        int solutions = 0;
 
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int j=0; j < n;j++)
        {
 
            p = scanner.nextInt();
            v = scanner.nextInt();
            t = scanner.nextInt();
 
            if (p+v+t ==3 || p+v+t ==2)
            {
                solutions++;
 
            }
        }
        System.out.println(solutions);
    }
}