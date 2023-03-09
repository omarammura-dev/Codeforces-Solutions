import java.util.ArrayList;
import java.util.Scanner;
 
 
 
public class Main {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     String s;
     int uppercase=0,lowercase=0;
     s = scanner.next();
     char[] chars = s.toCharArray();
     ArrayList<String> list = new ArrayList<>();
        for (Character c: chars) {
            if (Character.isUpperCase(c))
            {
                uppercase++;
            }
            else
            {
                lowercase++;
            }
        }
 
        if (lowercase>uppercase)
        {
            System.out.println(s.toLowerCase());
        }
        else if (uppercase == lowercase)
        {
            System.out.println(s.toLowerCase());
        }
        else
        {
            System.out.println(s.toUpperCase());
        }
 
    }
}