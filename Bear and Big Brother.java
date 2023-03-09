import java.util.Scanner;
 
 
 
public class Main {
    public static void main(String[] args) {
       
        int a,b,year=1;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b= scanner.nextInt();
 
        while (a*3<=b*2)
        {
            year++;
            a *=3;
            b*=2;
 
        }
        System.out.println(year);
    }
}