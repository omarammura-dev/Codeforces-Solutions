import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
 
public class Main {
    public static void main(String[] args) {
 
        ArrayList<Character> list = new ArrayList<>();
        String s;
        Scanner scanner = new Scanner(System.in);
        s = scanner.next();
        char[] chars = s.toCharArray();
        for (Character c : chars) {
            list.add(c);
        }
        if (Character.isUpperCase(list.get(0)))
        {
            //first letter is uppercase
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i));
            }
        }
        else {
            StringBuilder value = new StringBuilder();
            for (int i =1; i < list.size(); i++) {
                value.append(list.get(i).toString());
 
            }
            char c = Character.toUpperCase(list.get(0));
            System.out.println(c + value.toString());
        }
    }
}