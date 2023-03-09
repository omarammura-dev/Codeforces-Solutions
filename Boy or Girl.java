import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
 
 
 
public class Main {
    public static void main(String[] args) {
        /*
        * if number of character is odd he is male otherwise she is female
        * */
        String s;
        Scanner scanner = new Scanner(System.in);
        s = scanner.next().toLowerCase();
        char[] chars = s.toCharArray();
        int temp = 0 ;
 
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            for (int j =i+1; j < chars.length; j++) {
                if (chars[i] == chars[j] && i!=j)
                {
                    temp++;
                    break;
                }
            }
        }
 
 
 
        int temp2 = Math.abs(chars.length-temp);
 
        if (temp2 % 2 == 0)
        {
            System.out.println("CHAT WITH HER!");
 
        }
        else
        {
 
            System.out.println("IGNORE HIM!");
 
        }
 
    }
}